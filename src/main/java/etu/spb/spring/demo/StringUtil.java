package etu.spb.spring.demo;

import lombok.SneakyThrows;
import lombok.experimental.FieldDefaults;
import lombok.experimental.UtilityClass;

import static lombok.AccessLevel.PRIVATE;

@UtilityClass
public class StringUtil {

    public String END = "";

    @SneakyThrows
    public String method (String s) {
        return s + "!";
    }
}
