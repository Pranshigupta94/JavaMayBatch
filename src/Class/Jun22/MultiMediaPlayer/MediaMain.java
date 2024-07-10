package Class.Jun22.MultiMediaPlayer;

public class MediaMain {
    public static void main(String[] args) {
       AudioPlayer audio = new AudioPlayer();
       Video video = new Video();

       audio.displayDetails();
       video.displayDetails();

       audio.play();
       video.play();

    }
}
