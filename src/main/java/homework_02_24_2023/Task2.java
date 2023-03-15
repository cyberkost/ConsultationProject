package homework_02_24_2023;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        int[] result = plusOne(digits);
        System.out.println(Arrays.toString(result)); // [1, 2, 4]
    }

    public static int[] plusOne(int[] digits) {
        int carry = 1; // начинаем со значания 1, чтобы прибавить 1 к последнему разряду
        for (int i = digits.length - 1; i >= 0; i--) { // начинаем обход массива с конца
            int sum = digits[i] + carry; // складываем текущий разряд и "перенос" от предыдущей операции
            if (sum <= 9) { // если сумма меньше 10, то переноса нет, выходим из цикла
                digits[i] = sum;
                carry = 0;
                break;
            } else { // иначе переносим единицу на следующий разряд
                digits[i] = sum - 10;
                carry = 1;
            }
        }
        if (carry == 1) { // если остался перенос после всех операций, создаем новый массив и добавляем "1" в начало
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        } else { // иначе возвращаем исходный массив
            return digits;
        }
    }
}
