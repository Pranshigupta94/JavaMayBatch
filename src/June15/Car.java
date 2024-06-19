package June15;

public class Car extends Vehicle{
    int numOfSeats;

   public Car(String make, String model, String year, String color, String type, int numOfSeats) {
       super(make, model, year, color, type);
       this.numOfSeats = numOfSeats; // if we give default constructor in parent class we no need to use here const.

   }

    public void brake(){
        System.out.println("Car brake ");
        System.out.println(super.color); // super used to call parent
        System.out.println(this.numOfSeats); // this for current class variable
    }
}
