package makeev.springcourse;


import java.util.ArrayList;
import java.util.List;

public class RapMusic implements Music {

    private final List<String> playList = new ArrayList<>();

    {
        playList.add("Because i got high");
        playList.add("Sound of the police");
        playList.add("My name");
    }

    @Override
    public List<String> getSongs() {
        return playList;
    }
}