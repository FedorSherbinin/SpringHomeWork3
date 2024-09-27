package ru.geekbrains.SpringHomeWork3.services;

import org.springframework.stereotype.Service;
import ru.geekbrains.SpringHomeWork3.domain.User;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private final List<User> users = new ArrayList<>();

    public List<User> getAllUsers() {
        return users;
    }

    public User createUser(User user) {
        users.add(user);
        return user;
    }

    public User saveUser(User user) {
        users.add(user);
        return user;
    }

    public User getUserById(Long id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null);
    }

    public User updateUser(Long id, User user) {
        // Найдите пользователя по ID и обновите его
        for (User u : users) {
            if (u.getId().equals(id)) {
                u.setName(user.getName());
                u.setAge(user.getAge());
                return u;
            }
        }
        return null; // или выбросьте исключение, если пользователь не найден
    }

    public void deleteUser(Long id) {
        users.removeIf(user -> user.getId().equals(id));
    }
}
