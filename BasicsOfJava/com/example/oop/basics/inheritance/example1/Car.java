package BasicsOfJava.com.example.oop.basics.inheritance.example1;

public class Car extends Vehicle{

    Car(){
        super();
        this.type = "Car";
        this.manufacturer = "FORD";
        this.topSpeed = 300.0f;

    }
    Car(String manufacturer, float topSpeed){
        this();
        this.manufacturer = manufacturer;
        this.topSpeed = topSpeed;
    }
}
