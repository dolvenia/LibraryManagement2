package org.example.interfaces;

import org.example.models.User;

public interface UserService {
    public User addNewUser();
    public User getUser(User retrievedUser);
}
