package homework_03_11_2023;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int middleIndex = list.size() / 2;
        int currentIndex = 0;
        int middleElement = 0;

        Iterator<Integer> it = list.iterator();
        while (it.hasNext() && currentIndex <= middleIndex) {
            middleElement = it.next();
            currentIndex++;
        }
        System.out.println("Middle element is : " + middleElement);
    }
}
