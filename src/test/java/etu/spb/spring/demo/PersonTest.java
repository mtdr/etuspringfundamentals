package etu.spb.spring.demo;// import etu.spb.spring.demo.Person

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {
    @Test
    @DisplayName("\"SetAge\" method works correctly")
    void testSetAge() {
        // given
        Person person = new Person(55, "Федя", "Васичкин");
        Person person2 = new Person(21, "Вася", "Петичкин");

        // when
//        person.setAge(55);

        // then
        assertEquals(person.getAge(), 55);
        assertEquals(person2.getFirstName(), "Вася");
    }

}