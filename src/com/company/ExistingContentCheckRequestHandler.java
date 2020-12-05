package com.company;

public class ExistingContentCheckRequestHandler extends RequestHandler{
    @Override
    public void handleRequest(WebRequest request) {
        if (request.getPath() != "/dashboard" && request.getPath() != "/home") {

            System.out.println("Status 404 : Page missing");

        } else{
            successor.handleRequest(request);
        }
    }
}
