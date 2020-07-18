package sai.service;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GrpcServer {
    public static void main(String[] args) throws InterruptedException, IOException {
        Server server = ServerBuilder.forPort(9000)
                                     .addService(new GreetServiceImpl())
                                     .addService(new AdditionServiceImpl())
                                     .addService(new PrimeDecoImpl())
                                     .addService(new CalculatorServiceImpl())
                                     .build();

        server.start();

        System.out.println("server started at : " + server.getPort());

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutdown request received");
            server.shutdown();
            System.out.println("Server shutdown successful");
        }));

        server.awaitTermination();
    }
}
