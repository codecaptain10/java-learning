package concepts;

public class Car {
    private String mark;
    private String model;
    private int prise;
    private int middSpeed;
    private String color;
    private boolean isSportCar;



    public Car(String mark, String model, int prise, int middSpeed, String color, boolean isSportCar) {
        this.mark = mark;
        this.model = model;
        this.prise = prise;
        this.middSpeed = middSpeed;
        this.color = color;
        this.isSportCar = isSportCar;
    }

    public Car(String mark, String model){
        this.mark = mark;
        this.model = model;

    }

    public Car(){

    }

    //Methods
    public int driveFaster(int faster){
        this.middSpeed = this.middSpeed + faster;
        return this.middSpeed;
    }

    //No access to this method from object instance
    private void tellAboutCar(){
        System.out.println("Your car is a new model of "+this.mark+" "+this.model+".");
        System.out.println("It cost "+this.prise+".");

    }

}
