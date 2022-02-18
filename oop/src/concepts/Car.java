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

    public Car(){
        this.mark = "New Mark";
        this.model = "New Model";
        this.prise = 0;
        this.middSpeed = 50;
        this.color ="blue";
        this.isSportCar = true;
    }
}
