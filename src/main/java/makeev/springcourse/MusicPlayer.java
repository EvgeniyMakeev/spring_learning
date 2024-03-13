package makeev.springcourse;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MusicPlayer {
    private final List<Music> playList;

    public MusicPlayer(Music music1, Music music2, Music music3) {
        playList = new ArrayList<>();
        playList.add(music1);
        playList.add(music2);
        playList.add(music3);
    }

    public void playMusic() {
        Random random = new Random();
        int genre = random.nextInt(playList.size());
        List<String> playlist = playList.get(genre).getSongs();
        int track = random.nextInt(playlist.size());
        System.out.println("Playing: " + playlist.get(track));
    }
}
