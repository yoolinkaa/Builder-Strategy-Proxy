package ucu.edu.ua.builder;

import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@SuperBuilder
@ToString
public class User {
    private int id;
    private String name;
    private String email;
    private int age;
    private double weight;
    private double height;
    @Singular
    private List<String> occupations;

    public static void main(String[] args) {
        User user = User.builder()
                .id(1)
                .name("Iuliia")
                .email("yurha.pn@gmail.com")
                .age(18)
                .weight(100)
                .height(20)
                .occupation("APPS student")
                .build();
        System.out.println(user);
    }
}
