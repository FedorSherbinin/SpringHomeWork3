package ru.geekbrains.SpringHomeWork3.services;

import org.springframework.stereotype.Service;
import ru.geekbrains.SpringHomeWork3.domain.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class DataProcessingService {
    private List<User> userList = new ArrayList<>();

    public List<User> getAllUsers() {
        return userList;
    }

    public void addUserToList(User user) {
        userList.add(user);
    }

    public User getUserById(int id) {
        return userList.stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void sortUsersByAge() {
        Collections.sort(userList, new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                return Integer.compare(u1.getAge(), u2.getAge());
            }
        });
    }

    public void updateUser(int id, User updatedUser) {
        User user = getUserById(id);
        if (user != null) {
            user.setName(updatedUser.getName());
            user.setAge(updatedUser.getAge());
        }
    }

    public void deleteUser(int id) {
        userList.removeIf(user -> user.getId() == id);
    }
}
