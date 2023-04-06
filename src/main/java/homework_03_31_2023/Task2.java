package homework_03_31_2023;

// Написать программу, которая проверяет, что строка начинается буквой “J”или “N” и заканчивается “A”.
// Используем функциональный интерфейс Predicate.

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Task2 {
    public static void main(String[] args) {
        checkChar();
    }

    private static void checkChar() {
        List<String> names = Arrays.asList("LennA", "Nolaa", "Catley", "siA", "Johanna");
        Predicate<String> predicate = s -> s.matches("^[NnJj]+\\w+[Aa]$");
        names.stream()
                .filter(predicate)
                .forEach(System.out::println);
    }
}
