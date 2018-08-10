package lab.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.Singular;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class UsualPerson implements Person {

    @Default
    int id = 1;

    String name;

    Country country;

    int age;
    float height;

    @Default
    boolean isProgrammer = true;

    @Singular
    List<String> contacts;

    @Override
    public void sayHello(Person person) {
    }
}