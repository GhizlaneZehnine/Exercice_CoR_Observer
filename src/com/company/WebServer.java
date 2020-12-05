package com.company;

import java.util.ArrayList;

public class WebServer implements WebRequestObservable{

    private ArrayList<WebRequestObserver> observers;
    private RequestHandler firstHandler;

    public WebServer(RequestHandler firstHandler) {
        this.firstHandler = firstHandler;
        observers = new ArrayList<>();
    }

    public void getRequest(WebRequest request){
        firstHandler.handleRequest(request);
        this.notifyObservers(request);
    }

    @Override
    public void attach(WebRequestObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(WebRequestObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(WebRequest webRequest) {
        for (WebRequestObserver observer : observers){
            observer.update(webRequest);
        }
    }
}