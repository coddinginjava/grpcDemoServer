package sai.service;

import io.grpc.stub.StreamObserver;
import proto.sum.AdditionGrpc;
import proto.sum.Sum.Request;
import proto.sum.Sum.Response;

public class AdditionServiceImpl extends AdditionGrpc.AdditionImplBase {
    @Override
    public void addThem(Request request, StreamObserver<Response> responseObserver) {
        int a = request.getA();
        int b = request.getB();
        int c = a + b;

        Response response = Response.newBuilder().setC(c).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
