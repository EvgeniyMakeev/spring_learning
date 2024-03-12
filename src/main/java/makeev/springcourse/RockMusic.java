package makeev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private final List<String> playList = new ArrayList<>();

    {
        playList.add("TNT");
        playList.add("Say10");
        playList.add("We will rock you");
    }

    @Override
    public List<String> getSongs() {
        return playList;
    }
}
