package BasicsOfJava.com.example.oop.basics.interface_basics;

public class InterfaceExample {
    public static void main(String[] args) {

        Car car = new Car();
        car.stop();
        car.move();
        car.turn();

        // Vehicle vehicle = new Vehicle();  // tego nie mozemy zrobic poniewaz nie Vehicle nie jest klasa tylko Interfacem
        // java: Vehicle is abstract; cannot be instantiated

        Vehicle vehicle = car;  //  tworzymy nowy obiekt (vehicle) ktory implementuje interface
        System.out.println("vehicle: ");
        vehicle.turn();
        System.out.println(vehicle.getTopSpeed());

        // tworzymy nwowa instancje obiekty Car

        Vehicle car2 = new Car();
        System.out.println("car2: ");
        car2.turn();

        Car someCar = (Car) car2; // rzutowanie, aby miec dostep do calej instancji
        System.out.println(someCar.getTopSpeed());

        Plane plane = new Plane();
        Vehicle planeVehicle = plane;
        plane.turn();
        System.out.println("Plane speed is: " + plane.getTopSpeed() + " km/h");

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = car;
        vehicles[1] = car2;
        vehicles[2] = plane;

        vehicles[2].move();

        if (vehicles[2] instanceof Plane)
        {
            Plane somePlane = (Plane) vehicles[2];
            somePlane.turn();

            Flying flyingVehicle = somePlane;
            flyingVehicle.increaseHeight();
        }






    }


}
