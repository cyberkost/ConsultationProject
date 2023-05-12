package homework_05_05_2023;

import java.util.Stack;

// Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses substring.
// Example 1:
// Input: s = "(()"
// Output: 2
// Explanation: The longest valid parentheses substring is "()".
// Example 2:
// Input: s = ")()())"
// Output: 4
// Explanation: The longest valid parentheses substring is "()()".
// Example 3:
// Input: s = ""
// Output: 0

public class Main {
    public static int findNumberOfBrackets(String s) {
        int maxLen = 0;
        Stack<Integer> stack = new Stack<>();
        int lastUnpaired = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                if (stack.isEmpty()) {
                    lastUnpaired = i;
                } else {
                    stack.pop();
                    if (stack.isEmpty()) {
                        maxLen = Math.max(maxLen, i - lastUnpaired);
                    } else {
                        maxLen = Math.max(maxLen, i - stack.peek());
                    }
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s1 = "(()";
        String s2 = ")()())";
        String s3 = "";
        System.out.println(findNumberOfBrackets(s1));
        System.out.println(findNumberOfBrackets(s2));
        System.out.println(findNumberOfBrackets(s3));
    }
}
