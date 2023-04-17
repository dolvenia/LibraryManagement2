package org.example;

import org.example.models.Book;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Book book1 = new Book(123456, "BookName", 15.00);
        Book book2 = new Book();

        System.out.println(book1.getBookName());


    }
}




