package makeev.springcourse;

import java.util.List;

public class MusicPlayer {

    private List<Music> musicList;

    private String name;
    private int volume;

    public void setMusic(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void playMusic() {
        musicList.forEach(m -> System.out.println("Playing: " + m.getSong()));
    }
}
