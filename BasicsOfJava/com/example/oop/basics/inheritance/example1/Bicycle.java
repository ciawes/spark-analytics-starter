package BasicsOfJava.com.example.oop.basics.inheritance.example1;

public class Bicycle extends Vehicle{
    Bicycle(){
        // super();  dodane automatycznie, gdy nie ma
        type = "Bicycle";
        manufacturer = "Romet";
        topSpeed = 15.0f;
    }
}
