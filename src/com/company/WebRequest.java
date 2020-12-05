package com.company;

public class WebRequest {
    private String path;
    private User loggedUser;

    public WebRequest(String path, User user) {
        this.path = path;
        loggedUser = user;
    }

    public String getPath() {
        return path;
    }

    public User getLoggedUser() {
        return loggedUser;
    }
}
