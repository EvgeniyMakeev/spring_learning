package makeev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@Component
public class MusicPlayer {

    private final RockMusic rockMusic;
    private final RapMusic rapMusic;
    private final ClassicalMusic classicalMusic;


    public MusicPlayer(RockMusic rockMusic, RapMusic rapMusic, ClassicalMusic classicalMusic) {
        this.rockMusic = rockMusic;
        this.rapMusic = rapMusic;
        this.classicalMusic = classicalMusic;
    }

    public void playMusic(Genres genres) {
        List<String> playlist = new ArrayList<>();
        switch (genres) {
            case RAP -> playlist = rapMusic.getSongs();
            case ROCK -> playlist = rockMusic.getSongs();
            case CLASSICAL -> playlist = classicalMusic.getSongs();
        }
        Random random = new Random();
        int track = random.nextInt(playlist.size());
        System.out.println("Playing: " + playlist.get(track));
    }
}
