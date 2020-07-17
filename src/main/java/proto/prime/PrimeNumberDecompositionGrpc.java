package proto.prime;

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
    comments = "Source: prime.proto")
public final class PrimeNumberDecompositionGrpc {

  private PrimeNumberDecompositionGrpc() {}

  public static final String SERVICE_NAME = "PrimeNumberDecomposition";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.prime.Prime.Request,
      proto.prime.Prime.Response> getGetAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAll",
      requestType = proto.prime.Prime.Request.class,
      responseType = proto.prime.Prime.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<proto.prime.Prime.Request,
      proto.prime.Prime.Response> getGetAllMethod() {
    io.grpc.MethodDescriptor<proto.prime.Prime.Request, proto.prime.Prime.Response> getGetAllMethod;
    if ((getGetAllMethod = PrimeNumberDecompositionGrpc.getGetAllMethod) == null) {
      synchronized (PrimeNumberDecompositionGrpc.class) {
        if ((getGetAllMethod = PrimeNumberDecompositionGrpc.getGetAllMethod) == null) {
          PrimeNumberDecompositionGrpc.getGetAllMethod = getGetAllMethod = 
              io.grpc.MethodDescriptor.<proto.prime.Prime.Request, proto.prime.Prime.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "PrimeNumberDecomposition", "getAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.prime.Prime.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.prime.Prime.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new PrimeNumberDecompositionMethodDescriptorSupplier("getAll"))
                  .build();
          }
        }
     }
     return getGetAllMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PrimeNumberDecompositionStub newStub(io.grpc.Channel channel) {
    return new PrimeNumberDecompositionStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PrimeNumberDecompositionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PrimeNumberDecompositionBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PrimeNumberDecompositionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PrimeNumberDecompositionFutureStub(channel);
  }

  /**
   */
  public static abstract class PrimeNumberDecompositionImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAll(proto.prime.Prime.Request request,
        io.grpc.stub.StreamObserver<proto.prime.Prime.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                proto.prime.Prime.Request,
                proto.prime.Prime.Response>(
                  this, METHODID_GET_ALL)))
          .build();
    }
  }

  /**
   */
  public static final class PrimeNumberDecompositionStub extends io.grpc.stub.AbstractStub<PrimeNumberDecompositionStub> {
    private PrimeNumberDecompositionStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PrimeNumberDecompositionStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrimeNumberDecompositionStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PrimeNumberDecompositionStub(channel, callOptions);
    }

    /**
     */
    public void getAll(proto.prime.Prime.Request request,
        io.grpc.stub.StreamObserver<proto.prime.Prime.Response> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PrimeNumberDecompositionBlockingStub extends io.grpc.stub.AbstractStub<PrimeNumberDecompositionBlockingStub> {
    private PrimeNumberDecompositionBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PrimeNumberDecompositionBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrimeNumberDecompositionBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PrimeNumberDecompositionBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<proto.prime.Prime.Response> getAll(
        proto.prime.Prime.Request request) {
      return blockingServerStreamingCall(
          getChannel(), getGetAllMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PrimeNumberDecompositionFutureStub extends io.grpc.stub.AbstractStub<PrimeNumberDecompositionFutureStub> {
    private PrimeNumberDecompositionFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PrimeNumberDecompositionFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrimeNumberDecompositionFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PrimeNumberDecompositionFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_ALL = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PrimeNumberDecompositionImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PrimeNumberDecompositionImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL:
          serviceImpl.getAll((proto.prime.Prime.Request) request,
              (io.grpc.stub.StreamObserver<proto.prime.Prime.Response>) responseObserver);
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

  private static abstract class PrimeNumberDecompositionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PrimeNumberDecompositionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.prime.Prime.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PrimeNumberDecomposition");
    }
  }

  private static final class PrimeNumberDecompositionFileDescriptorSupplier
      extends PrimeNumberDecompositionBaseDescriptorSupplier {
    PrimeNumberDecompositionFileDescriptorSupplier() {}
  }

  private static final class PrimeNumberDecompositionMethodDescriptorSupplier
      extends PrimeNumberDecompositionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PrimeNumberDecompositionMethodDescriptorSupplier(String methodName) {
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
      synchronized (PrimeNumberDecompositionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PrimeNumberDecompositionFileDescriptorSupplier())
              .addMethod(getGetAllMethod())
              .build();
        }
      }
    }
    return result;
  }
}
