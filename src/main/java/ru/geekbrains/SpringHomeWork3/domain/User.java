package ru.geekbrains.SpringHomeWork3.domain;

public class User {
    private Long id;
    private String name;
    private int age;

    // Конструктор по умолчанию (для сериализации)
    public User() {
    }

    // Конструктор с параметрами
    public User(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Геттеры и сеттеры
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
