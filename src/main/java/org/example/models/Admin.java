package org.example.models;

public class Admin {
    private int AdminId;

    private String AdminName;


    public Admin(int AdminId, String AdminName){
        this.AdminId = AdminId;
        this.AdminName = AdminName;
    }

    public Admin(){

    }

    public String getAdminName(){

        return AdminName;
    }

    public void setAdminName(String AdminName){
        this.AdminName = AdminName;

    }

    public int getAdminId(){

        return AdminId;
    }

    public void setAdminId(int AdminId){
        this.AdminId = AdminId;
    }
}
