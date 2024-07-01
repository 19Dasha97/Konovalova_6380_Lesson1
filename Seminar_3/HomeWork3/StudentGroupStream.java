package Seminar_3.HomeWork3;

import java.util.Iterator;
import java.util.List;

import Seminar_3.Task_1.StudentGroup;

// — Создать класс Поток, содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable;

public class StudentGroupStream implements Iterable<StudentGroup>  {
    List<StudentGroup> groupsList;

    public StudentGroupStream(List<StudentGroup> groupsList) {
        this.groupsList = groupsList;
    }

    public List<StudentGroup> getGroupsList() {
        return groupsList;
    }

    public  void addGroup (StudentGroup studentGroup) {
        groupsList.add(studentGroup);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(this);
    }

    @Override
    public String toString() {
        return "Stream{" +
                "groupsList=" + groupsList +
                '}';
    }

}

