package sai.service;

import io.grpc.stub.StreamObserver;
import proto.greet.GreetServiceGrpc;
import proto.greet.Greeting.GreetRequest;
import proto.greet.Greeting.GreetResponse;
import proto.greet.Greeting.GreetingName;

public class GreetServiceImpl extends GreetServiceGrpc.GreetServiceImplBase {

    @Override
    public void greet(GreetRequest request, StreamObserver<GreetResponse> responseObserver) {
        //extract the field
        GreetingName greetingName = request.getGreetings();
        String firstName = greetingName.getFirstName();
        String lastName = greetingName.getFirstName();

        //create response
        GreetResponse greetResponse = GreetResponse.newBuilder()
                                                   .setResult("hi " + firstName + " " + lastName)
                                                   .build();
        // send response
        responseObserver.onNext(greetResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void greetManyTimes(GreetRequest request, StreamObserver<GreetResponse> responseObserver) {
        GreetingName greetings = request.getGreetings();
        String firstName = greetings.getFirstName();

        try {
            for (int i = 1; i <= 10; i++) {
                String result = firstName + " respose no. : " + i;
                GreetResponse response = GreetResponse.newBuilder()
                                                      .setResult(result).build();
                responseObserver.onNext(response);

                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            responseObserver.onCompleted();
        }
    }
}
