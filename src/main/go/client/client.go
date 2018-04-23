package main

import (
	"flag"
	"log"
	"time"

	pb "github.com/haolearn/api_grpc/src/main/go/api"
	epb "google.golang.org/genproto/googleapis/rpc/errdetails"

	"golang.org/x/net/context"
	"google.golang.org/grpc"
	"google.golang.org/grpc/credentials"
	"google.golang.org/grpc/testdata"
	google_protobuf "github.com/golang/protobuf/ptypes/any"

	"github.com/golang/protobuf/ptypes"
	"io"
	"google.golang.org/grpc/status"
)

var (
	tls                = flag.Bool("tls", false, "Connection uses TLS if true, else plain TCP")
	caFile             = flag.String("ca_file", "", "The file containning the CA root cert file")
	serverAddr         = flag.String("server_addr", "127.0.0.1:8980", "The server address in the format of host:port")
	serverHostOverride = flag.String("server_host_override", "x.test.youtube.com", "The server name use to verify the hostname returned by TLS handshake")
)

func runCheck(client pb.PolicyServiceClient) {
	ctx, cancel := context.WithTimeout(context.Background(), 10*time.Second)
	defer cancel()

	var items = make([]*google_protobuf.Any, 0)
	any, err := ptypes.MarshalAny(&pb.BusTicketCheckItem{
		Cuid: 0,
		Eid:  1,
	})

	if err != nil {
		log.Fatalf("%v", err)
	}
	for i := 0; i < 4; i++ {
		items = append(items, any)
	}
	startTime := time.Now()
	for i := 0; i < 100; i++ {
		reply, err := client.Check(ctx, &pb.CheckRequest{
			Header: &pb.RequestHeader{
				TraceId: "check",
				Key:     "key",
				Source:  "bus ticket",
			},
			BusiType: pb.BusiType_BUSI_TYPE_HOTEL,
			Items:    items,
		})
		if err != nil {
			// 解读错误码，请求端错误处理逻辑.
			if isFatal(err) {
				log.Fatalf("%v", err)
			}
		}
		log.Printf("reply:%v", reply)
	}
	log.Printf("use time:%v", time.Now().Sub(startTime).Nanoseconds()/1000000)
}

// 处理请求端获取服务端返回的约定失败：如,QuotaFailure
func isFatal(err error) bool {
	if err == io.EOF {
		log.Printf("EOF of stream")
		return false
	}
	s := status.Convert(err)
	for _, d := range s.Details() {
		switch info := d.(type) {
		case *epb.BadRequest:
			log.Printf("BadRequest failed:%s", info)
			return true
		case *epb.QuotaFailure:
			log.Printf("Quota failed:%s", info)
			return true
		default:
			log.Printf("Unexpected type failure:%s", info)
			return true
		}
	}
	return false
}

func runCheckStreaming(client pb.PolicyServiceClient) {
	ctx, cancel := context.WithTimeout(context.Background(), 10*time.Second)
	defer cancel()
	stream, err := client.CheckStreaming(ctx)
	if err != nil {
		log.Fatalf("%v.CheckStreaming %v", client, err)
	}
	for i := 0; i < 1100; i++ {
		req := &pb.CheckRequest{
			Header: &pb.RequestHeader{
				TraceId: "CheckStreaming",
			},
		}
		if err := stream.Send(req); err != nil {
			if isFatal(err) {
				log.Fatalf("send request Fail:%d\t%v", i, err)
			}
		}
	}
	reply, err := stream.CloseAndRecv()
	if err != nil {
		if isFatal(err) {
			log.Fatalf("%v.CloseAndRecv() got error %v, want %v", stream, err, nil)
		}
	}
	log.Printf("reply:%v", reply)
}

func runListPolicyStreaming(client pb.PolicyServiceClient) {
	ctx, cancel := context.WithTimeout(context.Background(), 10*time.Second)
	defer cancel()

	stream, err := client.ListPolicyStreaming(ctx, &pb.ListRequest{
		Header: &pb.RequestHeader{
			TraceId: "check",
			Key:     "key",
			Source:  "bus ticket",
		},
		Eid:      1,
		BusiType: pb.BusiType_BUSI_TYPE_CAR,
	})
	if err != nil {
		log.Fatalf("runListPolicyStreaming request failed:%v", err)
	}
	count := 0
	for {
		reply, err := stream.Recv()
		if err == io.EOF {
			break
		}
		if err != nil {
			log.Fatalf("runListPolicyStreaming read reply failed:%v", err)
		}
		count++
		log.Printf("%d\t%v\n", count, reply)
	}

}

func runListDetailStreaming(client pb.PolicyServiceClient) {
	ctx, cancel := context.WithTimeout(context.Background(), 10*time.Second)
	defer cancel()
	stream, err := client.ListDetailStreaming(ctx)
	if err != nil {
		log.Fatalf("%v.ListDetailStreaming(_) = _, %v", client, err)
	}
	// 等待chan
	waitc := make(chan struct{})
	// 读响应
	go func() {
		for {
			reply, err := stream.Recv()
			if err == io.EOF {
				// 读到尾部，关闭等待阻塞通道.
				close(waitc)
				return
			}
			if err != nil {
				log.Fatalf("Failed to receive a note : %v", err)
			}
			log.Printf("reply:%v", reply)
		}
	}()
	// 发送请求.
	for i := 0; i < 1000; i++ {
		req := &pb.ListDetailRequest{
			Header: &pb.RequestHeader{
				TraceId: "ListDetailStreaming",
			},
		}
		if err := stream.Send(req); err != nil {
			log.Fatalf("Failed to send req:%v", req)
		}
	}
	stream.CloseSend()
	<-waitc
}

func main() {
	flag.Parse()
	var opts []grpc.DialOption
	if *tls {
		if *caFile == "" {
			*caFile = testdata.Path("ca.pem")
		}
		creds, err := credentials.NewClientTLSFromFile(*caFile, *serverHostOverride)
		if err != nil {
			log.Fatalf("Failed to create TLS credentials %v", err)
		}
		opts = append(opts, grpc.WithTransportCredentials(creds))
	} else {
		opts = append(opts, grpc.WithInsecure())
	}
	conn, err := grpc.Dial(*serverAddr, opts...)
	if err != nil {
		log.Fatalf("fail to dial: %v", err)
	}
	defer func() {
		if e := conn.Close(); e != nil {
			log.Printf("Failed to close connection:%v", e)
		}
	}()

	client := pb.NewPolicyServiceClient(conn)

	//runCheck(client)
	runCheckStreaming(client)
	//runListPolicyStreaming(client)
	//runListDetailStreaming(client)
}
