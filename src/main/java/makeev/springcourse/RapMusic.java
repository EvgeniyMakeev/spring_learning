package makeev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
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