package homework_03_10_2023;

import java.util.ArrayList;
import java.util.Arrays;
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

    public static void findDuplicates1() {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for (int a : array) {
            if (!list.contains(a)) {    // ! - логическое НЕ
                list.add(a);
                array[count] = a;
                count++;
            }
        }
        System.out.println("k = " + list.size() + ", " + Arrays.toString(array));
    }
    public static void findDuplicates2() {
    // Второй способ
    int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] != arr[i + 1]) {
            arr[count] = arr[i + 1];
            count++;
        }
    }
        System.out.println("k = " + count + ", " + Arrays.toString(arr));

}

    public static void main(String[] args) {
        findDuplicates();
        findDuplicates1();
        findDuplicates2();
    }
}
