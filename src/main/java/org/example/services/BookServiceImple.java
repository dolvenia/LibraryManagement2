package org.example.services;

import org.example.interfaces.BookService;
import org.example.models.Book;
import org.example.models.User;

import java.util.Scanner;

public class BookServiceImple implements BookService {

    @Override
    public Book addNewBook() {
        Scanner input = new Scanner(System.in);

        System.out.print("BookId:  ");
        int BookId = input.nextInt();

        System.out.print("BookName:  ");
        String BookName = input.next();

        System.out.print("Price: ");
        double Price = Double.parseDouble(input.next());

        Book newBook = new Book(BookId,BookName,Price);
        
        return newBook;
    }

    @Override
    public Book getBook(Book retrievedBook) {
        return null;
    }
}
