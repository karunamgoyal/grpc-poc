package com.helloworld;

import com.helloworld.services.ContactResources;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;

/**
 * @author karunam.goyal
 * @project gRPC_POC
 */
public class GRPCStart {

    public static void main(String[] args) throws IOException, InterruptedException
    {
        Server server = ServerBuilder.forPort(9090).addService(new ContactResources()).build();

        server.start();

        System.out.println("Server Started at 9090");

        server.awaitTermination();
    }

}
