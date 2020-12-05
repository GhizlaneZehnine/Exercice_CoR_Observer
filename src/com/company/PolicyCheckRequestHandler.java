package com.company;

public class PolicyCheckRequestHandler extends RequestHandler{
    @Override
    public void handleRequest(WebRequest request) {
        if (request.getPath() == "/dashboard" && !request.getLoggedUser().isAdmin()) {

            System.out.println("Status 403 : user is not authorized to access this content");

        }
        if ( (request.getPath() == "/dashboard" && request.getLoggedUser().isAdmin()) || request.getPath()=="/home") {

            successor.handleRequest(request);

        }
    }
}
