package com.company;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("Start");
            System.out.println(Integer.parseInt(System.getenv("PORT")));
            HttpServer server = HttpServer.create(new InetSocketAddress("localhost", Integer.parseInt(System.getenv("PORT"))), 0);
            server.createContext("/", new HandlerHttp());
            server.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
