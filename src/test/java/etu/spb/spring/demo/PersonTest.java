package etu.spb.spring.demo;// import etu.spb.spring.demo.Person

import lombok.SneakyThrows;
import lombok.val;
import lombok.var;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {
    @Test
    @SneakyThrows
    @DisplayName("\"SetAge\" method works correctly")
    void testSetAge() {

        // given
//        Person person = new Person(55, "Федя", "Васичкин");
        val person = Person.builder()
                .age(55)
                .firstName("Федя")
//                .telephones(Arrays.asList("222-33-22", "333-22-33"))
                .telephone("222-33-22")
                .telephone("222-34-22")
                .telephone("222-35-22")
                .build();

        val person2 = new Person(21, "Вася", "Петичкин",
                Arrays.asList("222-33-22", "333-22-33"));

        Person person1 = Person.builder()
                .age(20)
                .firstName("Петя")
                .lastName("Васичкин")
                .telephones(Arrays.asList("222-33-22", "333-22-33"))
                .build();

        Person person3 = person2.withFirstName("Маша");

        // when
        person.setAge(55);

        // then
        assertEquals(person.getAge(), 55);
        assertEquals(person.getLastName(), "Петров");
        assertEquals(person1.getLastName(), "Васичкин");
        assertEquals(person2.getFirstName(), "Вася");
        assertEquals(person2.getLastName(), "Петичкин");
        assertEquals(person3.getFirstName(), "Маша");
        assertEquals(person3.getLastName(), "Петичкин");

        if (false)
            throw new IOException("khsgdf");
    }

}