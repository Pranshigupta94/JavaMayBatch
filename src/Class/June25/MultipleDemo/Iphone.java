package Class.June25.MultipleDemo;

public class Iphone extends AppStore implements AssitiveAI, Calculator, Camera, Computer,MusicPlayer, Phone, VideoGames{
    @Override
    public void voiceSpeech() {
        System.out.println("take pictures ");
    }

    @Override
    public void test() {
        System.out.println("take pictures ");
    }

    @Override
    public void calculate() {
        System.out.println("calculation ");
    }

    @Override
    public void takePictures() {
        System.out.println("take pictures ");
    }

    @Override
    public void surfInternet() {
        System.out.println("surf internet ");
    }

    @Override
    public void play() {
        System.out.println("play music ");
    }

    @Override
    public void pause() {
        System.out.println("pause music");
    }

    @Override
    public void stop() {
        System.out.println("stop music ");
    }

    @Override
    public void makeCalls() {
        System.out.println("make calls ");
    }

    @Override
    public void playGames() {
        System.out.println("play games ");
    }
}
