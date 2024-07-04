package June25.MultipleDemo;

public class Samsung extends AppStore implements Camera, Calculator, MusicPlayer, VideoGames{
    @Override
    public void calculate() {
        System.out.println("Calculation in Samsung");
    }

    @Override
    public void takePictures() {
        System.out.println("Picture taken in Samsung");

    }



    @Override
    public void play() {
        System.out.println("Play music in Samsung");
    }

    @Override
    public void pause() {
        System.out.println("Pause ");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }

    @Override
    public void playGames() {
        System.out.println("Play games in Samsung");
    }
}
