package com.copacabana.copacabana.models;

public class Login {
    private String token;
    private String userType;
    private String name;

    public Login(String token, String userType, String name) {
        this.token = token;
        this.userType = userType;
        this.name = name;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
