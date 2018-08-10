package etu.spb.spring.demo;

import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;

@UtilityClass
public class StringUtil {

    public String END = "";

    @SneakyThrows
    public String method (String s) {
        return s + "!";
    }
}
