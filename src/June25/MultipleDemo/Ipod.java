package June25.MultipleDemo;

public class Ipod implements MusicPlayer{
    @Override
    public void play() {
        System.out.println("Playing in Ipod");
    }

    @Override
    public void pause() {
        System.out.println("Pause Ipod");
    }

    @Override
    public void stop() {
        System.out.println("Stop Ipod");
    }
}
