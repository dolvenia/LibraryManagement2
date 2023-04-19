package org.example.services;

import org.example.interfaces.LibrarianService;
import org.example.models.Librarian;

import java.util.Scanner;
public class LibrarianServiceImple implements LibrarianService {


    @Override
    public Librarian addNewLibrarian() {
        Scanner input = new Scanner(System.in);

        System.out.print("LId: ");
        int LId = input.nextInt();

        System.out.print("LName: ");
        String LName = input.next();

        Librarian newLibrarian = new Librarian(LId, LName);

        return newLibrarian;
    }

    @Override
    public Librarian getLibrarian(Librarian retrievedLibrarian) {
        return null;
    }
}
