package ru.geekbrains.SpringHomeWork3.repository;

import org.springframework.stereotype.Component;
import ru.geekbrains.SpringHomeWork3.domain.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepository {
    private List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }
}
