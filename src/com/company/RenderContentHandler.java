package com.company;

public class RenderContentHandler  extends RequestHandler{
    @Override
    public void handleRequest(WebRequest request) {
        if (request.getPath() == "/dashboard") {
            System.out.println("Status 200 : Dashboard content here");
        }
        if (request.getPath() == "/home") {
            System.out.println("Status 200 : Home content here");
        }
    }
}
