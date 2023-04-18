package org.example.interfaces;

import org.example.models.Book;
public interface BookService {
    public Book addNewBook();

    public Book getBook (Book retrievedBook);
}
