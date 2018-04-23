package main

import (
	"flag"
	"net"
	pb "github.com/learnhao/api_grpc/src/main/go/api"
	epb "google.golang.org/genproto/googleapis/rpc/errdetails"
	"fmt"
	"log"
	"google.golang.org/grpc"
	"google.golang.org/grpc/credentials"
	"google.golang.org/grpc/testdata"
	google_protobuf "github.com/golang/protobuf/ptypes/any"
	"sync"
	"context"
	"io"
	"time"
	"github.com/golang/protobuf/ptypes"
	"google.golang.org/grpc/codes"
	"google.golang.org/grpc/status"
)

var (
	port     = flag.Int("port", 8980, "server port")
	tls      = flag.Bool("tls", false, "Connection uses TLS if true, else plain TCP")
	certFile = flag.String("cert_file", "", "The TLS cert file")
	keyFile  = flag.String("key_file", "", "The TLS key file")
)

type policyServiceServer struct {
	mu sync.Mutex
}

// unary一元请求.
func (s *policyServiceServer) Check(ctx context.Context, req *pb.CheckRequest) (*pb.PolicyResponse, error) {
	log.Printf("check req:%+v", req)
	startTime := time.Now()
	for _, any := range req.Items {
		switch req.BusiType {
		case pb.BusiType_BUSI_TYPE_BUSTICKET:
			item := &pb.BusTicketCheckItem{}
			if err := ptypes.UnmarshalAny(any, item); err != nil {
				log.Fatalf("Failed to UnmarshalAny:%v,err:%v", any, err)
				log.Printf("checkItem:%v", item)
			}
		case pb.BusiType_BUSI_TYPE_CAR:
			item := &pb.CarCheckItem{}
			if err := ptypes.UnmarshalAny(any, item); err != nil {
				log.Fatalf("Failed to UnmarshalAny:%v,err:%v", any, err)
				log.Printf("checkItem:%v", item)
			}
		case pb.BusiType_BUSI_TYPE_FLIGHT:
			item := &pb.FlightCheckItem{}
			if err := ptypes.UnmarshalAny(any, item); err != nil {
				log.Fatalf("Failed to UnmarshalAny:%v,err:%v", any, err)
				log.Printf("checkItem:%v", item)
			}
		default:
			// 服务端返回约定错误,如：BadRequest.
			st := status.New(codes.InvalidArgument, "请求参数错误")
			ds, err := st.WithDetails(
				&epb.BadRequest{
					FieldViolations: []*epb.BadRequest_FieldViolation{{
						Field:       fmt.Sprintf("unknown busitype:%v", req.BusiType),
						Description: "请求业务类型没定义",
					}},
				},
			)
			if err != nil {
				return nil, st.Err()
			}
			return nil, ds.Err()
		}
	}

	return &pb.PolicyResponse{
		Header: &pb.ResponseHeader{
			TraceId:   "check",
			TotalTime: int64(time.Now().Sub(startTime).Nanoseconds() / 1000000),
			Status:    pb.Status_STATUS_SUCCESS,
			Msg:       "",
		},
	}, nil
}

// unary一元请求.
func (s *policyServiceServer) ListPolicy(ctx context.Context, req *pb.ListRequest) (*pb.PolicyResponse, error) {
	log.Printf("listPolicy req:%+v", req)
	startTime := time.Now()
	return &pb.PolicyResponse{
		Header: &pb.ResponseHeader{
			TraceId:   "listPolicy",
			TotalTime: int64(time.Now().Sub(startTime).Nanoseconds() / 1000000),
			Status:    pb.Status_STATUS_SUCCESS,
			Msg:       "",
		},
	}, nil
}

// unary一元请求.
func (s *policyServiceServer) ListDetail(ctx context.Context, req *pb.ListDetailRequest) (*pb.PolicyResponse, error) {
	log.Printf("listDetail req:%+v", req)
	startTime := time.Now()
	return &pb.PolicyResponse{
		Header: &pb.ResponseHeader{
			TraceId:   "listDetail",
			TotalTime: int64(time.Now().Sub(startTime).Nanoseconds() / 1000000),
			Status:    pb.Status_STATUS_SUCCESS,
			Msg:       "",
		},
	}, nil
}

// 流请求,单向流请求.
func (s *policyServiceServer) CheckStreaming(stream pb.PolicyService_CheckStreamingServer) error {
	startTime := time.Now()
	count := 0
	for {
		req, err := stream.Recv()
		if err == io.EOF {
			return stream.SendAndClose(&pb.PolicyResponse{
				Header: &pb.ResponseHeader{
					TraceId:   "CheckStreaming",
					TotalTime: int64(time.Now().Sub(startTime).Nanoseconds() / 1000000),
					Status:    pb.Status_STATUS_SUCCESS,
					Msg:       "",
				},
			})
		}
		if err != nil {
			return err
		}
		count++
		log.Printf("stream request:%+v", req)
		if count > 1000 {
			st := status.New(codes.ResourceExhausted, "请求stream太大！")
			ds, err := st.WithDetails(
				&epb.QuotaFailure{
					Violations: []*epb.QuotaFailure_Violation{{
						Subject:       fmt.Sprintf("stream data too large:%d", count),
						Description: "request stream too large",
					}},
				},
			)
			if err != nil {
				return st.Err()
			}
			return  ds.Err()
		}
	}
}

// 流响应.
func (s *policyServiceServer) ListPolicyStreaming(req *pb.ListRequest, stream pb.PolicyService_ListPolicyStreamingServer) error {
	log.Printf("ListPolicyStreaming req:%v", req)
	for i := 0; i < 10000; i++ {
		startTime := time.Now()
		var reply = &pb.PolicyResponse{
			Header: &pb.ResponseHeader{
				TraceId:   "ListPolicyStreaming",
				TotalTime: int64(time.Now().Sub(startTime).Nanoseconds() / 1000000),
				Status:    pb.Status_STATUS_SUCCESS,
				Msg:       "",
			},
		}
		log.Printf("reply:%v", reply)
		if err := stream.Send(reply); err != nil {
			return err
		}
	}
	return nil
}

// 双向流，请求、响应都为流.
func (s *policyServiceServer) ListDetailStreaming(stream pb.PolicyService_ListDetailStreamingServer) error {
	for {
		in, err := stream.Recv()
		if err == io.EOF {
			return nil
		}
		if err != nil {
			return err
		}
		log.Printf("request:%v", in)

		startTime := time.Now()

		s.mu.Lock()
		// 锁定资源，处理逻辑.
		any, err := ptypes.MarshalAny(&pb.BusTicketCheckItem{
			Cuid: 10,
			Eid:  11,
		})
		var data = make([]*google_protobuf.Any, 0)
		for i := 0; i < 10; i++ {
			data = append(data, any)
		}
		if err != nil {
			log.Fatalf("Failed MarshalAny:", err)
		}
		s.mu.Unlock()
		var reply = &pb.PolicyResponse{
			Header: &pb.ResponseHeader{
				TraceId:   "ListDetailStreaming",
				TotalTime: int64(time.Now().Sub(startTime).Nanoseconds() / 1000000),
				Status:    pb.Status_STATUS_SUCCESS,
				Msg:       "",
			},
			Data: data,
		}

		for i := 0; i < 10; i++ {
			log.Printf("reply:%v", reply)
			if err := stream.Send(reply); err != nil {
				return err
			}
		}
	}

	return nil
}

func newServer() *policyServiceServer {
	return &policyServiceServer{}
}

func main() {
	flag.Parsed()
	lis, err := net.Listen("tcp", fmt.Sprintf("localhost:%d", *port))
	if err != nil {
		log.Fatal("Fail to listen:%v", err)
	}
	var opts []grpc.ServerOption
	if *tls {
		if *certFile == "" {
			*certFile = testdata.Path("server1.pem")
		}
		if *keyFile == "" {
			*keyFile = testdata.Path("server1.key")
		}
		creds, err := credentials.NewServerTLSFromFile(*certFile, *keyFile)
		if err != nil {
			log.Fatalf("Failed to generate credentials:%v", err)
		}
		opts = []grpc.ServerOption{grpc.Creds(creds)}
	}
	grpcServer := grpc.NewServer(opts...)
	pb.RegisterPolicyServiceServer(grpcServer, newServer())
	grpcServer.Serve(lis)
}
