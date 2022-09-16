package BasicsOfJava.com.example.oop.basics.inheritance.example1;

public class Vehicle {   // Klasa
    public String type;
    public String manufacturer;
    public float topSpeed;

    Vehicle(){           //  Konstruktor
        type = "unknown";
        manufacturer = "unknown";
        topSpeed = 0;
    }

    public void printInfo(){   // Funkcja drukujaca
        System.out.println("type: " + type + " manufacturer: "
                + manufacturer + " topSpeed: " + topSpeed);
    }
}
