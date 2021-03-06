// Code generated by protoc-gen-go. DO NOT EDIT.
// source: service.proto

package api

import proto "github.com/golang/protobuf/proto"
import fmt "fmt"
import math "math"

import (
	context "golang.org/x/net/context"
	grpc "google.golang.org/grpc"
)

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// Client API for PolicyService service

type PolicyServiceClient interface {
	// 政策规则检查.
	Check(ctx context.Context, in *CheckRequest, opts ...grpc.CallOption) (*PolicyResponse, error)
	// 查规则列表.
	ListPolicy(ctx context.Context, in *ListRequest, opts ...grpc.CallOption) (*PolicyResponse, error)
	// 查规则明细.
	ListDetail(ctx context.Context, in *ListDetailRequest, opts ...grpc.CallOption) (*PolicyResponse, error)
	// 流方式发送多个请求.
	CheckStreaming(ctx context.Context, opts ...grpc.CallOption) (PolicyService_CheckStreamingClient, error)
	// 查规则列表,流方式响应.
	ListPolicyStreaming(ctx context.Context, in *ListRequest, opts ...grpc.CallOption) (PolicyService_ListPolicyStreamingClient, error)
	// 流方式发送请求、流方式接收多个响应.
	ListDetailStreaming(ctx context.Context, opts ...grpc.CallOption) (PolicyService_ListDetailStreamingClient, error)
}

type policyServiceClient struct {
	cc *grpc.ClientConn
}

func NewPolicyServiceClient(cc *grpc.ClientConn) PolicyServiceClient {
	return &policyServiceClient{cc}
}

func (c *policyServiceClient) Check(ctx context.Context, in *CheckRequest, opts ...grpc.CallOption) (*PolicyResponse, error) {
	out := new(PolicyResponse)
	err := grpc.Invoke(ctx, "/api.PolicyService/check", in, out, c.cc, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *policyServiceClient) ListPolicy(ctx context.Context, in *ListRequest, opts ...grpc.CallOption) (*PolicyResponse, error) {
	out := new(PolicyResponse)
	err := grpc.Invoke(ctx, "/api.PolicyService/listPolicy", in, out, c.cc, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *policyServiceClient) ListDetail(ctx context.Context, in *ListDetailRequest, opts ...grpc.CallOption) (*PolicyResponse, error) {
	out := new(PolicyResponse)
	err := grpc.Invoke(ctx, "/api.PolicyService/listDetail", in, out, c.cc, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *policyServiceClient) CheckStreaming(ctx context.Context, opts ...grpc.CallOption) (PolicyService_CheckStreamingClient, error) {
	stream, err := grpc.NewClientStream(ctx, &_PolicyService_serviceDesc.Streams[0], c.cc, "/api.PolicyService/checkStreaming", opts...)
	if err != nil {
		return nil, err
	}
	x := &policyServiceCheckStreamingClient{stream}
	return x, nil
}

type PolicyService_CheckStreamingClient interface {
	Send(*CheckRequest) error
	CloseAndRecv() (*PolicyResponse, error)
	grpc.ClientStream
}

type policyServiceCheckStreamingClient struct {
	grpc.ClientStream
}

func (x *policyServiceCheckStreamingClient) Send(m *CheckRequest) error {
	return x.ClientStream.SendMsg(m)
}

func (x *policyServiceCheckStreamingClient) CloseAndRecv() (*PolicyResponse, error) {
	if err := x.ClientStream.CloseSend(); err != nil {
		return nil, err
	}
	m := new(PolicyResponse)
	if err := x.ClientStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

func (c *policyServiceClient) ListPolicyStreaming(ctx context.Context, in *ListRequest, opts ...grpc.CallOption) (PolicyService_ListPolicyStreamingClient, error) {
	stream, err := grpc.NewClientStream(ctx, &_PolicyService_serviceDesc.Streams[1], c.cc, "/api.PolicyService/listPolicyStreaming", opts...)
	if err != nil {
		return nil, err
	}
	x := &policyServiceListPolicyStreamingClient{stream}
	if err := x.ClientStream.SendMsg(in); err != nil {
		return nil, err
	}
	if err := x.ClientStream.CloseSend(); err != nil {
		return nil, err
	}
	return x, nil
}

type PolicyService_ListPolicyStreamingClient interface {
	Recv() (*PolicyResponse, error)
	grpc.ClientStream
}

type policyServiceListPolicyStreamingClient struct {
	grpc.ClientStream
}

func (x *policyServiceListPolicyStreamingClient) Recv() (*PolicyResponse, error) {
	m := new(PolicyResponse)
	if err := x.ClientStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

func (c *policyServiceClient) ListDetailStreaming(ctx context.Context, opts ...grpc.CallOption) (PolicyService_ListDetailStreamingClient, error) {
	stream, err := grpc.NewClientStream(ctx, &_PolicyService_serviceDesc.Streams[2], c.cc, "/api.PolicyService/listDetailStreaming", opts...)
	if err != nil {
		return nil, err
	}
	x := &policyServiceListDetailStreamingClient{stream}
	return x, nil
}

type PolicyService_ListDetailStreamingClient interface {
	Send(*ListDetailRequest) error
	Recv() (*PolicyResponse, error)
	grpc.ClientStream
}

type policyServiceListDetailStreamingClient struct {
	grpc.ClientStream
}

func (x *policyServiceListDetailStreamingClient) Send(m *ListDetailRequest) error {
	return x.ClientStream.SendMsg(m)
}

func (x *policyServiceListDetailStreamingClient) Recv() (*PolicyResponse, error) {
	m := new(PolicyResponse)
	if err := x.ClientStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

// Server API for PolicyService service

type PolicyServiceServer interface {
	// 政策规则检查.
	Check(context.Context, *CheckRequest) (*PolicyResponse, error)
	// 查规则列表.
	ListPolicy(context.Context, *ListRequest) (*PolicyResponse, error)
	// 查规则明细.
	ListDetail(context.Context, *ListDetailRequest) (*PolicyResponse, error)
	// 流方式发送多个请求.
	CheckStreaming(PolicyService_CheckStreamingServer) error
	// 查规则列表,流方式响应.
	ListPolicyStreaming(*ListRequest, PolicyService_ListPolicyStreamingServer) error
	// 流方式发送请求、流方式接收多个响应.
	ListDetailStreaming(PolicyService_ListDetailStreamingServer) error
}

func RegisterPolicyServiceServer(s *grpc.Server, srv PolicyServiceServer) {
	s.RegisterService(&_PolicyService_serviceDesc, srv)
}

func _PolicyService_Check_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CheckRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(PolicyServiceServer).Check(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/api.PolicyService/Check",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(PolicyServiceServer).Check(ctx, req.(*CheckRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _PolicyService_ListPolicy_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ListRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(PolicyServiceServer).ListPolicy(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/api.PolicyService/ListPolicy",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(PolicyServiceServer).ListPolicy(ctx, req.(*ListRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _PolicyService_ListDetail_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ListDetailRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(PolicyServiceServer).ListDetail(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/api.PolicyService/ListDetail",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(PolicyServiceServer).ListDetail(ctx, req.(*ListDetailRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _PolicyService_CheckStreaming_Handler(srv interface{}, stream grpc.ServerStream) error {
	return srv.(PolicyServiceServer).CheckStreaming(&policyServiceCheckStreamingServer{stream})
}

type PolicyService_CheckStreamingServer interface {
	SendAndClose(*PolicyResponse) error
	Recv() (*CheckRequest, error)
	grpc.ServerStream
}

type policyServiceCheckStreamingServer struct {
	grpc.ServerStream
}

func (x *policyServiceCheckStreamingServer) SendAndClose(m *PolicyResponse) error {
	return x.ServerStream.SendMsg(m)
}

func (x *policyServiceCheckStreamingServer) Recv() (*CheckRequest, error) {
	m := new(CheckRequest)
	if err := x.ServerStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

func _PolicyService_ListPolicyStreaming_Handler(srv interface{}, stream grpc.ServerStream) error {
	m := new(ListRequest)
	if err := stream.RecvMsg(m); err != nil {
		return err
	}
	return srv.(PolicyServiceServer).ListPolicyStreaming(m, &policyServiceListPolicyStreamingServer{stream})
}

type PolicyService_ListPolicyStreamingServer interface {
	Send(*PolicyResponse) error
	grpc.ServerStream
}

type policyServiceListPolicyStreamingServer struct {
	grpc.ServerStream
}

func (x *policyServiceListPolicyStreamingServer) Send(m *PolicyResponse) error {
	return x.ServerStream.SendMsg(m)
}

func _PolicyService_ListDetailStreaming_Handler(srv interface{}, stream grpc.ServerStream) error {
	return srv.(PolicyServiceServer).ListDetailStreaming(&policyServiceListDetailStreamingServer{stream})
}

type PolicyService_ListDetailStreamingServer interface {
	Send(*PolicyResponse) error
	Recv() (*ListDetailRequest, error)
	grpc.ServerStream
}

type policyServiceListDetailStreamingServer struct {
	grpc.ServerStream
}

func (x *policyServiceListDetailStreamingServer) Send(m *PolicyResponse) error {
	return x.ServerStream.SendMsg(m)
}

func (x *policyServiceListDetailStreamingServer) Recv() (*ListDetailRequest, error) {
	m := new(ListDetailRequest)
	if err := x.ServerStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

var _PolicyService_serviceDesc = grpc.ServiceDesc{
	ServiceName: "api.PolicyService",
	HandlerType: (*PolicyServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "check",
			Handler:    _PolicyService_Check_Handler,
		},
		{
			MethodName: "listPolicy",
			Handler:    _PolicyService_ListPolicy_Handler,
		},
		{
			MethodName: "listDetail",
			Handler:    _PolicyService_ListDetail_Handler,
		},
	},
	Streams: []grpc.StreamDesc{
		{
			StreamName:    "checkStreaming",
			Handler:       _PolicyService_CheckStreaming_Handler,
			ClientStreams: true,
		},
		{
			StreamName:    "listPolicyStreaming",
			Handler:       _PolicyService_ListPolicyStreaming_Handler,
			ServerStreams: true,
		},
		{
			StreamName:    "listDetailStreaming",
			Handler:       _PolicyService_ListDetailStreaming_Handler,
			ServerStreams: true,
			ClientStreams: true,
		},
	},
	Metadata: "service.proto",
}

func init() { proto.RegisterFile("service.proto", fileDescriptor4) }

var fileDescriptor4 = []byte{
	// 226 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xe2, 0xe2, 0x2d, 0x4e, 0x2d, 0x2a,
	0xcb, 0x4c, 0x4e, 0xd5, 0x2b, 0x28, 0xca, 0x2f, 0xc9, 0x17, 0x62, 0x4e, 0x2c, 0xc8, 0x94, 0xe2,
	0x2d, 0x4a, 0x2d, 0x2c, 0x4d, 0x2d, 0x2e, 0x81, 0x88, 0x49, 0xf1, 0x15, 0xa5, 0x16, 0x17, 0xe4,
	0xe7, 0x15, 0x43, 0xd5, 0x18, 0x7d, 0x61, 0xe2, 0xe2, 0x0d, 0xc8, 0xcf, 0xc9, 0x4c, 0xae, 0x0c,
	0x86, 0xe8, 0x15, 0xd2, 0xe7, 0x62, 0x4d, 0xce, 0x48, 0x4d, 0xce, 0x16, 0x12, 0xd4, 0x4b, 0x2c,
	0xc8, 0xd4, 0x73, 0x06, 0xb1, 0x83, 0x20, 0x66, 0x48, 0x09, 0x83, 0x85, 0x20, 0xea, 0x83, 0xa0,
	0x06, 0x09, 0x19, 0x73, 0x71, 0xe5, 0x64, 0x16, 0x97, 0x40, 0x44, 0x85, 0x04, 0xc0, 0x4a, 0x7c,
	0x32, 0x8b, 0x4b, 0xf0, 0x6a, 0xb2, 0x84, 0x68, 0x72, 0x49, 0x2d, 0x49, 0xcc, 0xcc, 0x11, 0x12,
	0x83, 0x6b, 0x82, 0x08, 0xe0, 0xd5, 0x6a, 0xc5, 0xc5, 0x07, 0x76, 0x60, 0x70, 0x49, 0x51, 0x6a,
	0x62, 0x6e, 0x66, 0x5e, 0x3a, 0xb1, 0x2e, 0xd5, 0x60, 0x14, 0xb2, 0xe3, 0x12, 0x46, 0xb8, 0x15,
	0x61, 0x00, 0x71, 0x8e, 0x36, 0x60, 0x14, 0x72, 0x83, 0xe8, 0x87, 0xb8, 0x12, 0xa1, 0x9f, 0x14,
	0xf7, 0x6b, 0x30, 0x1a, 0x30, 0x3a, 0x29, 0x71, 0xc9, 0x25, 0xe7, 0xe7, 0xea, 0x55, 0x64, 0xe6,
	0xa5, 0x57, 0x96, 0xe6, 0xe9, 0x15, 0x80, 0x55, 0x80, 0x15, 0x43, 0xa3, 0x30, 0x80, 0x21, 0x89,
	0x0d, 0x1c, 0x43, 0xc6, 0x80, 0x00, 0x00, 0x00, 0xff, 0xff, 0x8c, 0xfa, 0x5b, 0xea, 0xd6, 0x01,
	0x00, 0x00,
}
