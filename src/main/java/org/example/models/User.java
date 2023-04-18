package org.example.models;

public class User {

    private int UserId;
    private String UserName;

    //constructors for creating and populating the fields
    public User(int UserId, String UserName){
        this.UserId = UserId;
        this.UserName = UserName;
    }

    public User(){

    }

    //getters and setters for accessing and modifying data for the object
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

    //used to out and format User object as JSON
    @Override
    public String toString() {
        return "User{" +
                "UserId=" + UserId +
                ", UserName='" + UserName + '\'' +
                '}';
    }
}
