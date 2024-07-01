package Seminar_3.HomeWork3;

import java.util.Iterator;
import java.util.List;

import Seminar_3.Task_1.StudentGroup;

public class StreamIterator implements Iterator<StudentGroup> {
    List<StudentGroup> groupsList;
    int counter;

    public StreamIterator(StudentGroupStream stream) {
        this.groupsList = stream.getGroupsList();
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < groupsList.size();
    }

    @Override
    public StudentGroup next() {
        if(hasNext())
            return groupsList.get(counter++);
        return null;
    }
}
