package org.example.services;

import org.example.models.User;

import java.util.Scanner;

public class AdminServiceImpl {

    UserServiceImpl userService = new UserServiceImpl();

    Scanner input = new Scanner(System.in);

    public void getUserInput() {
        System.out.println("Select an option:\n1: Add Librarian\n2: Add Borrower");
        int option = input.nextInt();

        if (option == 1) {
            System.out.println("Adding new Librarian");
        } else {
            System.out.println("Adding new Borrower");
            User user = userService.addNewUser();
            System.out.println(user.toString());
        }
    }
}
