package Assignment.Assignment5;

public class Vehicle {

    String make;
    String model;
    String year;

    public Vehicle(String make, String model, String year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void start()
    {
        System.out.println("Car starts");
    }

    public void stop(){
        System.out.println("Car stop");
    }

    public void displayInfo(){

    }


}
