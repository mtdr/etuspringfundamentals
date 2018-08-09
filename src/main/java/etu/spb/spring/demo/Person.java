package etu.spb.spring.demo;

import lombok.*;
import lombok.experimental.FieldDefaults;

import static lombok.AccessLevel.PRIVATE;

//@Data //@Getter //@Setter //@ToString //@EqualsAndHashCode //@RequiredArgsConstructor
@Value //@Getter {final class} @AllArgsConstructor @FieldDefaults(level = PRIVATE, makeFinal = true)
public class Person {

//    @Getter(onMethod = @__(@Override))
    int age;
    String firstName;
    String lastName;
}
