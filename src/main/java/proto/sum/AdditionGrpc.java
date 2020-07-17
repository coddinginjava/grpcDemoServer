package proto.sum;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: sum.proto")
public final class AdditionGrpc {

  private AdditionGrpc() {}

  public static final String SERVICE_NAME = "Addition";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.sum.Sum.Request,
      proto.sum.Sum.Response> getAddThemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addThem",
      requestType = proto.sum.Sum.Request.class,
      responseType = proto.sum.Sum.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.sum.Sum.Request,
      proto.sum.Sum.Response> getAddThemMethod() {
    io.grpc.MethodDescriptor<proto.sum.Sum.Request, proto.sum.Sum.Response> getAddThemMethod;
    if ((getAddThemMethod = AdditionGrpc.getAddThemMethod) == null) {
      synchronized (AdditionGrpc.class) {
        if ((getAddThemMethod = AdditionGrpc.getAddThemMethod) == null) {
          AdditionGrpc.getAddThemMethod = getAddThemMethod = 
              io.grpc.MethodDescriptor.<proto.sum.Sum.Request, proto.sum.Sum.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Addition", "addThem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.sum.Sum.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.sum.Sum.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new AdditionMethodDescriptorSupplier("addThem"))
                  .build();
          }
        }
     }
     return getAddThemMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdditionStub newStub(io.grpc.Channel channel) {
    return new AdditionStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdditionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AdditionBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdditionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AdditionFutureStub(channel);
  }

  /**
   */
  public static abstract class AdditionImplBase implements io.grpc.BindableService {

    /**
     */
    public void addThem(proto.sum.Sum.Request request,
        io.grpc.stub.StreamObserver<proto.sum.Sum.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getAddThemMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddThemMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.sum.Sum.Request,
                proto.sum.Sum.Response>(
                  this, METHODID_ADD_THEM)))
          .build();
    }
  }

  /**
   */
  public static final class AdditionStub extends io.grpc.stub.AbstractStub<AdditionStub> {
    private AdditionStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdditionStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdditionStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdditionStub(channel, callOptions);
    }

    /**
     */
    public void addThem(proto.sum.Sum.Request request,
        io.grpc.stub.StreamObserver<proto.sum.Sum.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddThemMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AdditionBlockingStub extends io.grpc.stub.AbstractStub<AdditionBlockingStub> {
    private AdditionBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdditionBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdditionBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdditionBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.sum.Sum.Response addThem(proto.sum.Sum.Request request) {
      return blockingUnaryCall(
          getChannel(), getAddThemMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AdditionFutureStub extends io.grpc.stub.AbstractStub<AdditionFutureStub> {
    private AdditionFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdditionFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdditionFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdditionFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.sum.Sum.Response> addThem(
        proto.sum.Sum.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getAddThemMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_THEM = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AdditionImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AdditionImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_THEM:
          serviceImpl.addThem((proto.sum.Sum.Request) request,
              (io.grpc.stub.StreamObserver<proto.sum.Sum.Response>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AdditionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdditionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.sum.Sum.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Addition");
    }
  }

  private static final class AdditionFileDescriptorSupplier
      extends AdditionBaseDescriptorSupplier {
    AdditionFileDescriptorSupplier() {}
  }

  private static final class AdditionMethodDescriptorSupplier
      extends AdditionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AdditionMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AdditionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdditionFileDescriptorSupplier())
              .addMethod(getAddThemMethod())
              .build();
        }
      }
    }
    return result;
  }
}
