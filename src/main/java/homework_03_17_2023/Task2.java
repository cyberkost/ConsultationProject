package homework_03_17_2023;

import java.util.HashSet;

// Данный код выведет 4. Так как в классе Person не переопределены методы Equals и Hashcode.
// Объекты класса р2 и р4 имеют разный Hashcode.

public class Task2 {
    public static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }

//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//
//            Person person = (Person) o;
//
//            return Objects.equals(name, person.name);
//        }
//
//        @Override
//        public int hashCode() {
//            return name != null ? name.hashCode() : 0;
//        }
//
        public String toString() {
            return name;

        }
    }

    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("Иван");
        Person p2 = new Person("Мария");
        Person p3 = new Person("Пётр");
        Person p4 = new Person("Мария");
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        System.out.println(set.size());
//        System.out.println(p2.hashCode());
//        System.out.println(p4.hashCode());
    }
}

