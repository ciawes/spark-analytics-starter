package BasicsOfJava.com.example.stream;

import java.util.ArrayList;
import java.util.List;

public class CountMethod {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Dodge", 250, 300000, 4));
        cars.add(new Car("Citroen", 180, 200000, 3));
        cars.add(new Car("Opel", 220, 150000, 4));
        cars.add(new Car("Merc", 250, 400000, 5));
        cars.add(new Car("GMC", 170, 100000, 3));
        cars.add(new Car("Porshe", 300, 800000, 5));
        cars.add(new Car("BMW", 240, 300000, 5));

        long countMethod = cars.stream().filter(car -> car.topSpeed >= 200).count();
        // mozemy rzutowac zamiast long: int countMethod = (int) ... reszta kodu
        System.out.println(countMethod);  // 5


    }
}
