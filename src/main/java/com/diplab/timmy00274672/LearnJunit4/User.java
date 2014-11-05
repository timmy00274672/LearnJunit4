package com.diplab.timmy00274672.LearnJunit4;

public class User {
    private String password;
    private String username;

    public User(String password, String username) {
	super();
	this.password = password;
	this.username = username;
    }

    public String getPassword() {
	return password;
    }

    public String getUsername() {
	return username;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public void setUsername(String username) {
	this.username = username;
    }

}
