package Seminar_3.HomeWork3;

import java.util.Comparator;

public class StreamComparator implements Comparator<StudentGroupStream> {

    @Override
    public int compare(StudentGroupStream o1, StudentGroupStream o2) {
        int stream1Size = o1.getGroupsList().size();
        int stream2Size = o2.getGroupsList().size();

        return Integer.compare(stream1Size, stream2Size);
    }
}
