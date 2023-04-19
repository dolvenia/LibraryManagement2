package org.example.models;

public class Librarian {

    private int LId;
    private String LName;

    public Librarian(int LId, String LName){
        this.LId = LId;
        this.LName = LName;
    }

    public Librarian(){

    }

    public int getLId(){

        return LId;
    }

    public void setLId(int LId){
        this.LId = LId;
    }

    public String getLName(){
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }
    
}
