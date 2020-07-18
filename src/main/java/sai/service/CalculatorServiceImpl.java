package sai.service;

import io.grpc.stub.StreamObserver;
import proto.cal.CalculatorGrpc;
import proto.cal.CalculatorOuterClass.Request;
import proto.cal.CalculatorOuterClass.Response;

public class CalculatorServiceImpl extends CalculatorGrpc.CalculatorImplBase {

    @Override
    public StreamObserver<Request> getAverage(StreamObserver<Response> responseObserver) {


        StreamObserver<Request> requestObserver = new StreamObserver<Request>() {
            int sum = 0;
            int count = 0;

            @Override
            public void onNext(Request request) {
                System.out.println("got the values :"+request.getNumbers());
                sum += request.getNumbers();
                count++;
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                float f = (float)sum/count;
                System.out.println("avg -> "  + f);
                responseObserver.onNext(Response.newBuilder().setAvg(f).build());
                responseObserver.onCompleted();
            }
        };
        return requestObserver;

    }
}
