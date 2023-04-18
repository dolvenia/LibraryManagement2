package org.example;

import org.example.models.Book;
import org.example.models.User;
import org.example.services.AdminServiceImpl;
import org.example.services.UserServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AdminServiceImpl adminService = new AdminServiceImpl();
        adminService.getUserInput();


























        //Instantiated an object for User class
        User user = new User();

        //Instantiated an object for UserService
        UserServiceImpl userService = new UserServiceImpl();

        //calling and storing User response for addNewUser()
        user = userService.addNewUser();

        //outputting the User object using the toString() method
        System.out.println(user.toString());

        /*System.out.println("Dummy data");
        Scanner input = new Scanner(System.in);
        input.nextLine();

        int Num = 2;
        Book[] book = new Book[Num];

        String BookName;

        for (int i = 0; i < Num; i++) {

            BookName = input.nextLine();
            book[i] = new Book(BookName);

        }
        for (int i = 0; i < Num; i++) {
            book[i].show();


        System.out.println("Hello world!");

        Book book1 = new Book(123456, "BookName", 15.00);
        Book book2 = new Book();

        System.out.println(book1.getBookName());*/
        //}
    }
}





