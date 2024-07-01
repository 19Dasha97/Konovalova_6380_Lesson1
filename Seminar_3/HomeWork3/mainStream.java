package Seminar_3.HomeWork3;

import java.util.ArrayList;
import java.util.List;

// — Создать класс Поток, содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable;
// — Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Поток;
// — Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя созданный StreamComparator;

import Seminar_3.Task_1.Student;
import Seminar_3.Task_1.StudentGroup;

public class mainStream {
    public static void main(String[] args) {
        
        Student student1 = new Student("Denis", 4);
        Student student2 = new Student("Matvei", 5);
        Student student3 = new Student("Sasha", 6);
        Student student4 = new Student("Lena", 7);

        List<Student> studentList1 = new ArrayList<>();
        studentList1.add(student1);
        StudentGroup studentGroup1 = new StudentGroup();

        List<Student> studentList2 = new ArrayList<>();

        studentList2.add(student2);
        studentList2.add(student3);
        studentList2.add(student4);
        StudentGroup studentGroup2 = new StudentGroup();

        List<StudentGroup> groupsList = new ArrayList<>();
        groupsList.add(studentGroup1);
        groupsList.add(studentGroup2);

        StudentGroupStream stream = new StudentGroupStream(groupsList);
        StudentGroupStream stream0 = new StudentGroupStream(new ArrayList<>());

        List<StudentGroupStream> streams = new ArrayList<>();
        streams.add(stream);
        streams.add(stream0);

        StreamService streamService = new StreamService(streams);
        for (StudentGroupStream item: streams) {
            System.out.println(item);
        }

        System.out.println();

        List<StudentGroupStream> sortedStreams = streamService.sortBySize();
        for (StudentGroupStream item: sortedStreams) {
            System.out.println(item);
        }

        StreamIterator streamIterator = new StreamIterator(stream);
        while (streamIterator.hasNext()) {
            System.out.println(streamIterator.next());
        }

        System.out.println();

        for (StudentGroup group: stream) {
            System.out.println(group);
        }

    }
}
