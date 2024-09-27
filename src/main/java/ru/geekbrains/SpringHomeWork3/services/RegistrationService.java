package ru.geekbrains.SpringHomeWork3.services;

import org.springframework.stereotype.Service;
import ru.geekbrains.SpringHomeWork3.domain.User;

@Service
public class RegistrationService {
    public User registerUser(Long id, String name, int age) {
        return new User(id, name, age);  // Создание пользователя с параметрами
    }
}
