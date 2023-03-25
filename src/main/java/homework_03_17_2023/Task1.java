package homework_03_17_2023;

import java.util.HashMap;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(findNoRepeatChar("leetcode"));
        System.out.println(findNoRepeatChar("loveleetcode"));
        System.out.println(findNoRepeatChar("aabb"));
    }

    public static int findNoRepeatChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
