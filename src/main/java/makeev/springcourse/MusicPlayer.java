package makeev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private List<Music> musicList;

    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2,
                       @Qualifier("rapMusic") Music music3) {
        musicList = new ArrayList<>();
        musicList.add(music1);
        musicList.add(music2);
        musicList.add(music3);
    }

    public String playMusic() {
        StringBuilder stringBuilder = new StringBuilder();
        musicList.forEach(m -> stringBuilder.append("\nPlaying: ").append(m.getSong()));
        return stringBuilder.toString();
    }
}
