package org.example.models;

public class User {

    private int UserId;

    private String UserName;

    public User(int UserId, String UserName){
        this.UserId = UserId;
        this.UserName = UserName;
    }

    public User(){

    }

    public int getUserId(){

        return UserId;
    }

    public void setUserId(int UserId){

        this.UserId = UserId;
    }

    public String Username(){
        return UserName;
    }

    public void setUserName(String UserName){
        this.UserName = UserName;
    }
}
