package org.example.services;

import org.example.interfaces.UserService;
import org.example.models.User;

import java.util.Scanner;

//this is where the business logic goes
public class UserServiceImpl implements UserService {

    //implementing the addNewUserMethod from UserService interface
    @Override
    public User addNewUser() { //actual code for the method
        Scanner input = new Scanner(System.in);

        System.out.print("User ID: ");
        int userId = input.nextInt();

        System.out.print("Username: ");
        String username = input.next();

        User newUser1 = new User(userId, username);

/*        User newUser2 = new User();
        newUser2.setUserId(2);
        newUser2.setUserName("User2");
        System.out.println(newUser2.toString());*/

        //returning the newUser1 object which has all the values for the User
        return newUser1;
    }

    @Override
    public User getUser(User retrievedUser) {

        return null;
    }


}
