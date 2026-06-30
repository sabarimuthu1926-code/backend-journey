package week3_comparator_lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorHelper {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(
                new Student(23,"Luffy"),
                new Student(24,"Luffy"),
                new Student(26,"Luffy")
        ));




        students.sort(Comparator.comparing(Student::getName).thenComparingInt(Student::getAge).reversed());

       students.forEach(System.out::println);

    }
}
