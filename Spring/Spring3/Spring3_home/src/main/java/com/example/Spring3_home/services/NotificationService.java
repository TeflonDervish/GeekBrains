package com.example.Spring3_home.services;

import com.example.Spring3_home.domain.User;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void notifyUser(User user){
        System.out.println("A new user has been created: " + user.getName());
    }
}