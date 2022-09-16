package BasicsOfJava.com.example.oop.basics.access_modifiers.private_example;

public class PrivateExample {
    public static void main(String[] args) {
        Car car = new Car();

        car.setName("Masseratti");
        System.out.println(car.getName());

    }
}
