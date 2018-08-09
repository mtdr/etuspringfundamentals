package etu.spb.spring.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.experimental.FieldDefaults;

import java.util.List;

import static lombok.AccessLevel.PRIVATE;

@Data //@Getter //@Setter //@ToString //@EqualsAndHashCode //@RequiredArgsConstructor
//@Value //@Getter {final class} @AllArgsConstructor @FieldDefaults(level = PRIVATE, makeFinal = true) //@ToString //@EqualsAndHashCode
@FieldDefaults(level = PRIVATE)
@Builder //@AllArgsConstructor(access = PACKAGE)
public class Person {

//    @Getter(onMethod = @__(@Override))
    int age;
    String firstName;

    @Builder.Default
    final String lastName = "Петров";

    @Singular
    List<String> telephones;

    public static void main(String... __) {
        int x = 5;
        int y;
        int z;
        y = x + 8;
    }
}
