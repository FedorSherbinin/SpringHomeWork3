package ru.geekbrains.SpringHomeWork3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.geekbrains.SpringHomeWork3.services.DataProcessingService;

import java.util.List;
import ru.geekbrains.SpringHomeWork3.domain.User;

@RestController
public class TaskController {

    private final DataProcessingService service;

    @Autowired
    public TaskController(DataProcessingService service) {
        this.service = service;
    }

    @GetMapping("/sorted-users")
    public List<User> getSortedUsersByAge() {
        service.sortUsersByAge(); // Сортируем пользователей по возрасту
        return service.getAllUsers(); // Возвращаем отсортированный список
    }
}
