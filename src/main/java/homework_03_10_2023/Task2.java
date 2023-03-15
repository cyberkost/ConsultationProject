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

    public static void main(String[] args) {
        findSingleNumber();
    }
}
