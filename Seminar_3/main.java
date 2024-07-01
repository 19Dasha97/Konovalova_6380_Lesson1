package Seminar_3;

import java.util.ArrayList;
// import java.util.Collection;
import java.util.Collections;
// import java.util.Comparator;
import java.util.List;

import Seminar_3.Task_1.Student;
import Seminar_3.Task_1.StudentGroup;

public class main {
    public static void mainP(String[] args) {

        StudentGroup studentGroup = new StudentGroup();
        Student Ivan = new Student("Ivan", 1);
        Student Dasha = new Student("Dasha", 2);
        Student Alexandr = new Student("Alexandr", 3);

        studentGroup.addStudent(Ivan);
        studentGroup.addStudent(Dasha);
        studentGroup.addStudent(Alexandr);


        // Iterator <Student> iterator = new StudentGroupIterator(studentGroup);
        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
            
        // }

        for (Student student : studentGroup) {
            System.out.println(student);
        }

        ArrayList<Student> arrayList = new ArrayList<>(List.of(Ivan, Dasha, Alexandr));
        System.out.println(arrayList);
        //Collections.sort(arrayList, new StudentComparator()); // лямда выражение (s1, s2) -> s1.id - s2.id (или наоборот s2-s1);
        Collections.sort(arrayList, (s1, s2) -> s2.id - s1.id);
        System.out.println(arrayList);

    }
}
