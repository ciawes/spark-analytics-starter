package BasicsOfJava.com.example.oop.basics.object_example;

public class ObjectExample {
    public static void main(String[] args) {

        CarObject car = new CarObject("Ford", "Raptor", 2022);
        CarObject car2 = new CarObject("Buggatti","Veyron", 2023);

        System.out.println(car);
        System.out.println(car.hashCode());

        if (car.equals(car2))
        {
            System.out.println("car rowne car2, wskazuja na ta sama referencje");
        } else {
            System.out.println("rozne referencje");
        }

        System.out.println(car.toString());

    }
}
