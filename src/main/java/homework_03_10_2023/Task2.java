package homework_03_10_2023;

import java.util.HashSet;

public class Task2 {
    public static void findSingleNumber() {
        int[] nums = {4, 1, 2, 1, 2};
        HashSet<Integer> set = new HashSet<>();
        for (int element : nums) {
            if (!set.add(element)) {
                set.remove(element);
            }
        }
        System.out.println("Single number: " + set.iterator().next());
    }

    public static void findSingleNumber1() {
        // [1,1,2,3,3,4,4]
        // [1, 2, 3, 4, 1, 4, 3]
        int[] array = {1, 3, 2, 4, 1, 4, 3};
        for (int i = 0; i < array.length; i++) {
            boolean havePair = false;
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    continue;
                }
                if (array[i] == array[j]) {
                    // у i-го элемента есть пара - j-ый элемент
                    havePair = true;
                    break;
                }
            }
            //
            if (!havePair) {        // if (havePair == false) {
                // i-уникальный элемент?
                System.out.println(array[i]);
                return;
            }
        }
        System.out.println("Нет уникальных элементов");
    }


    public static void main(String[] args) {
        findSingleNumber();
        findSingleNumber1();
    }
}
