package Jun22.MultiMediaPlayer;

public class Video extends MediaDevice {

    String videoTitle;
    int duration;

    @Override
    public void displayDetails() {
        System.out.println("Video");
    }
    public void play(){
        System.out.println("Play the video");
}

}
