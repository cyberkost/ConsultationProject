package homework_03_31_2023;

import java.util.Arrays;
import java.util.List;

// Допустим, у нас есть коллекция состоящая из строк.
// Arrays.asList(«Highload», «High», «Load», «Highload»).
// Посчитайте, сколько раз объект «High» встречается в коллекции.
// Используйте Stream API.

public class Task1 {
    public static void main(String[] args) {
        findObject();
    }
    public static void findObject() {
        List<String> list = Arrays.asList("Highload", "High", "Load", "Highload");
        long word = list.stream()
                .filter("High"::equals)  //.filter(str -> str.equals("High"))
                .count();
        System.out.println(word);
    }
}
