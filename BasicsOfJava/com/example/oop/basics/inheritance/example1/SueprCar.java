package BasicsOfJava.com.example.oop.basics.inheritance.example1;

public class SueprCar extends Car{
    SueprCar(){
        type = "SuperCar";
        topSpeed = 300.0f;
    }
    public void setSportMode(){
        System.out.println("Sport mode activated");
    }
}
