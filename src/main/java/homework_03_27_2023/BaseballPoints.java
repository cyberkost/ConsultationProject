package homework_03_27_2023;

import java.util.Stack;

public class BaseballPoints {
    public static void main(String[] args) {
        String[] ops = {"5","2","C","D","+"};
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < ops.length; i++) {
            String element = ops[i];
            switch (element) {
                case "C":
                    stack.pop();
                    break;
                case "D":
                    stack.push(2 * stack.peek());
                    break;
                case "+":
                    int a = stack.pop();
                    int b = stack.peek();
                    stack.push(a);
                    stack.push(a + b);
                    break;
                default:
                    stack.add(Integer.parseInt(element));
            }
        }
        int sum = 0;
        while (!stack.empty()) {
            sum += stack.pop();
        }
        System.out.println(sum);
    }
}

