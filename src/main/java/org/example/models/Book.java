package org.example.models;

public class Book {
    private int BookId;
    private String BookName;
    private double price;

    private Boolean isBorrowed;

    public Book(int bookId, String BookName, double price) {
        this.BookId = BookId;
        this.BookName = BookName;
        this.price = this.price;
        this.isBorrowed = false;
    }

    public Book() {
    }

    public int getBookId() {

        return BookId;
    }

    public void setBookId(int BookId) {

        this.BookId = BookId;
    }

    public String getBookName() {

        return BookName;
    }

    public void setBookName(String BookName) {

        this.BookName = BookName;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public void BorrowBook(){

        isBorrowed = true;
    }
     public void ReturnBook(){

        isBorrowed = false;
     }
     public Boolean isBorrowed(){

        return isBorrowed;
     }

    public void show() {
        System.out.println("Book ID: " + BookId);
        System.out.println("Book Name: " + BookName);
        System.out.print("Status: ");
        if (isBorrowed)
            System.out.println("Not Available");
        else
            System.out.println("Available");
        System.out.println();
    }
}

