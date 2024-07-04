package June25.MultipleDemo;

public class IphoneMain {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        iphone.calculate();
        iphone.makeCalls();
        iphone.stop();

        Samsung samsung = new Samsung();
        samsung.calculate();
        samsung.playGames();
        samsung.takePictures();



    }
}
