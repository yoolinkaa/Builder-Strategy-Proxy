package ucu.edu.ua.strategy;

import lombok.Getter;

@Getter
public class Client {
    private static int count = 0;
    private final int id;
    private final String name;
    private final String email;
    private final int age;
    private final String sex;

    public Client(String name, String email, int age, String sex) {
        this.id = ++count;
        this.name = name;
        this.email = email;
        this.age = age;
        this.sex = sex;
    }
}