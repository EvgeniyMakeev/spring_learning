package makeev.springcourse;

import java.util.ArrayList;
import java.util.List;

public class ClassicalMusic implements Music {
    private final List<String> playList = new ArrayList<>();

    {
        playList.add("Hungarian Rhapsody");
        playList.add("Requiem");
        playList.add("Time of the year");
    }

    @Override
    public List<String> getSongs() {
        return playList;
    }
}
