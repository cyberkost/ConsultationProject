package homework_03_17_2023;

import java.util.HashMap;

public class Task3 {
    public static void main(String[] args) {
        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer eu feugiat tellus. Nam molestie diam sed libero egestas pellentesque. Nulla.";
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        char[] strArray = str.toCharArray();

        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        for (char c : charCountMap.keySet()) {
            if (c == ' ') {
                System.out.println("The space character occurs " + charCountMap.get(c) + " times.");
            } else {
                System.out.println("The character " + c + " occurs " + charCountMap.get(c) + " times.");
            }
        }
    }
}
