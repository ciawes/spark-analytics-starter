package BasicsOfJava.com.example.oop.basics;

class Car{
    String maufacturer;
    String name;
    int year;
    String color;
    float speed;

    public Car(){
        this.maufacturer = "unknown";
    }

    public Car(String maufacturer, String name, int year,
               String color, float speed){
        this.maufacturer = maufacturer;
        this.name = name;
        this.year = year;
        this.color = color;
        this.speed = speed;
    }

    public void printInfo(){
        System.out.println(this.maufacturer + " "
                         + this.name + " "
                         + this.year);
    }
}

public class CarExample {
    public static void main(String[] args) {

        Car ford = new Car();
        ford.maufacturer = "Ford";
        ford.name = "Mustang";
        ford.color = "blue";
        ford.year = 1967;
        ford.speed = 200.0f;
        ford.printInfo();

        Car chevrolet = new Car();
        chevrolet.maufacturer = "Chevrolet";
        chevrolet.name = "Camaro";
        chevrolet.color = "red";
        chevrolet.year = 2020;
        chevrolet.speed = 300.0f;
        chevrolet.printInfo();

        Car dodge = new Car("Dodge", "Viper",
                1976, "Black", 280.0f);
        dodge.printInfo();
    }
}
