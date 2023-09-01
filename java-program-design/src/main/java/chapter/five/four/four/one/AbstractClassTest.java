package chapter.five.four.four.one;

import java.util.Arrays;

import static chapter.five.four.one.one.Println.println;

public class AbstractClassTest {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        people[0] = new Employee("张浩", 50000, 1989, 10, 1);
        people[1] = new Student("李明", "计算机科学");
        for (Person p : people) System.out.println(p.getName() + "," + p.getDescription());

        println(Arrays.toString(people));
    }
}

