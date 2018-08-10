package lab.model;

import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.Singular;
import lombok.experimental.FieldDefaults;

import java.util.List;

import static lombok.AccessLevel.PRIVATE;

@Data
@Builder
@FieldDefaults(level = PRIVATE)
public class UsualPerson implements Person {

    int id;

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