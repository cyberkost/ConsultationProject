package homework_03_04_2023;

public class Task1 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        findTwoSumIndices(nums, target);
    }

    public static void findTwoSumIndices(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println(i + "," + j);
                    return;
                }
            }
        }
        System.out.println("No two elements in the array sum up to the target value.");
    }
}
