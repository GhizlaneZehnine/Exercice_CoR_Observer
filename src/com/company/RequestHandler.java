package com.company;

public abstract class RequestHandler {
    RequestHandler successor;

    public void setSuccessor(RequestHandler successor){
        this.successor = successor;
    }
    public abstract void handleRequest(WebRequest request);
}
