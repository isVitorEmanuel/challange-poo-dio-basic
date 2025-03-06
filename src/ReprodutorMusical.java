package POO.Challange1.Central;

import java.util.ArrayList;
import java.util.List;

public class ReprodutorMusical {
    private List<String> musics;
    private String currentMusic;
    private Boolean isPlaying;

    public ReprodutorMusical() {
        musics = new ArrayList<>();
        currentMusic = "";
        isPlaying = false;

        musics.add("Here comes the sun");
        musics.add("Hey, Jude");
        musics.add("Watermelon");
    }

    public List<String> getMusics() { return musics; }
    public String getCurrentMusic() { return currentMusic; }
    public Boolean isPlaying() { return isPlaying; }

    public void setMusics(List<String> musics) { this.musics = musics; }
    public void setCurrentMusic(String currentMusic) { this.currentMusic = currentMusic; }

    public void play() {
        isPlaying = true;

        if (currentMusic.isEmpty()) {
            System.out.println("No music selected");
            return;
        }

        System.out.println("Playing music: " + this.currentMusic);
    }

    public void pause() {
        isPlaying = false;
        System.out.println("Pause");
    }

    public void selectMusic(String music) {
        this.setCurrentMusic(music);
    }

    public void nextMusic() {
        int indexMusic = musics.indexOf(currentMusic);
        currentMusic = musics.get(++indexMusic);
    }

    public void previousMusic() {
        int indexMusic = musics.indexOf(currentMusic);
        currentMusic = musics.get(--indexMusic);
    }
}
