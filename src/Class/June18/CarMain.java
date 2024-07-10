package Class.June18;

public class CarMain {
    public static void main(String[] args) {

        MusicPlayer mp1 = new MusicPlayer("FM");
        MusicPlayer mp2 = new MusicPlayer("CD");

        Car car = new Car("Honda", "Accord", mp1);
    }
}
