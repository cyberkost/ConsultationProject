package homework_03_10_2023;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void findDuplicates() {
        List<Integer> list = new ArrayList<>(List.of(0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 4, 4));
        List<Integer> kList = new ArrayList<>();
        for (int element : list) {
            if (!kList.contains(element)) {
                kList.add(element);
            }
        }
        System.out.println("Number of elements: " + kList.size());
        System.out.println("List without duplicates: " + kList);
    }

    public static void main(String[] args) {
        findDuplicates();
    }
}
