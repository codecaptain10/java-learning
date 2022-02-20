package pl.codecaptain;
import  concepts.Car;


public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello OOP!");

        //New instance of class Car
        Car car = new Car();
        Car audi = new Car("Audi", "A7", 300000,110,"silver",true);
        Car vw = new Car("Volkswagen", "Passat");

        //Run public method
        //audi.driveFaster(15);

        //No access to private method
        //audi.tellAboutCar()
    }
}
