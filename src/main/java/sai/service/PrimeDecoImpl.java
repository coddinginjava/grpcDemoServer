package sai.service;

import io.grpc.stub.StreamObserver;
import proto.prime.Prime.Request;
import proto.prime.Prime.Response;
import proto.prime.PrimeNumberDecompositionGrpc.PrimeNumberDecompositionImplBase;

public class PrimeDecoImpl extends PrimeNumberDecompositionImplBase {

    @Override
    public void getAll(Request request, StreamObserver<Response> responseObserver) {
        int k = 2;
        int N = request.getN();

        try {
            while (N > 1) {
                if (N % k == 0) {
                    Response response = Response.newBuilder().setResult(k).build();
                    Thread.sleep(500);
                    responseObserver.onNext(response);
                    N = N / k;
                } else {
                    k = k + 1;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            responseObserver.onCompleted();
        }
    }
}
