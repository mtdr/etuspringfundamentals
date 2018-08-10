package etu.spb.spring.demo;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.Wither;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static lombok.AccessLevel.PRIVATE;

@Data //@Getter //@Setter //@ToString //@EqualsAndHashCode //@RequiredArgsConstructor
//@Value //@Getter {final class} @AllArgsConstructor @FieldDefaults(level = PRIVATE, makeFinal = true) //@ToString //@EqualsAndHashCode
@FieldDefaults(level = PRIVATE)
@Builder //@AllArgsConstructor(access = PACKAGE)
@Slf4j
@AllArgsConstructor
public class Person {

//    @Getter(onMethod = @__(@Override))
    int age;

    @Wither
    String firstName;

    @Builder.Default
    final String lastName = "Петров";

    @Singular
    List<String> telephones;

    @SneakyThrows
    public static void main(String... __) {
        log.error("khgsdf");

    }
}
