package BasicsOfJava.com.example.oop.basics.inheritance.example1;

public class BasicInheritance {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();   // Nowy obiekt klasy Vehicle
       // vehicle.printInfo();    // odwolanie sie do funkcji drukujdej klasy Vehicle

        Car car = new Car();
        car.printInfo();

        Car car1 = new Car("Dodge", 230.0f);
        car1.printInfo();

        Bicycle bicycle = new Bicycle();
        bicycle.printInfo();

        SueprCar sueprCar = new SueprCar();
        sueprCar.printInfo();
        sueprCar.setSportMode();
    }
}
