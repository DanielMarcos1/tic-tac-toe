package com.tictactoe.tictactoe.services;

import com.tictactoe.tictactoe.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tictactoe.tictactoe.repositories.UserRepository;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    // Creates user
    public User createUser(User user) {
        return userRepository.save(user);
    }

    // Finds user by id or null if it doesn't exist
    public User getUserById(String id) {
        return userRepository.findById(id).orElse(null);
    }

    // Method to find all users that returns it in a list
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Method to update a user
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }

}
