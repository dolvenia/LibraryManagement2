package org.example.models;

public class Author {

    private String AuthorName;

    private int AuthorId;


    public Author(String AuthorName,int AuthorId){
        this.AuthorName = AuthorName;
        this.AuthorId = AuthorId;

    }

    public Author(){

    }

    public String getAuthorName(){

        return AuthorName;
    }

    public void setAuthorName(String AuthorName){

        this.AuthorName = AuthorName;
    }

    public int getAuthorId(){

        return AuthorId;
    }

    public void setAuthorId(){

        this.AuthorId = AuthorId;
    }


}
