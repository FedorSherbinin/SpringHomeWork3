package ru.geekbrains.SpringHomeWork3.services;

import org.springframework.stereotype.Service;
import ru.geekbrains.SpringHomeWork3.domain.User;

@Service
public class NotificationService {
    public void notifyUser(User user) {
        System.out.println("A new user has been created: " + user.getName());
    }

    public void sendNotification(String message) {
        System.out.println(message);
    }
}
