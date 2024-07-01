package Seminar_3.HomeWork3;

import java.util.ArrayList;
import java.util.List;

public class StreamService {
        List<StudentGroupStream> streams;

    public StreamService(List<StudentGroupStream> streams) {
        this.streams = streams;
    }

    public List<StudentGroupStream> sortBySize() {
        List<StudentGroupStream> sortedStreams = new ArrayList<>(streams);
        sortedStreams.sort(new StreamComparator());
        return sortedStreams;
    }
}
