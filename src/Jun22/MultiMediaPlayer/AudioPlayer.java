package Jun22.MultiMediaPlayer;

public class AudioPlayer extends MediaDevice{

    String songName;
    String artist;

    @Override
    public void displayDetails() {
        System.out.println("Audio");

    }
    public void play(){
        System.out.println("Play the audio");}
}

