package BasicsOfJava.com.example.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LimitMethod {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Dodge", 250, 300000, 4));
        cars.add(new Car("Citroen", 180, 200000, 3));
        cars.add(new Car("Opel", 220, 150000, 4));
        cars.add(new Car("Merc", 250, 400000, 5));
        cars.add(new Car("GMC", 170, 100000, 3));
        cars.add(new Car("Porshe", 300, 800000, 5));
        cars.add(new Car("BMW", 240, 300000, 5));

        List<Car> cars3elements = cars.stream().filter(car -> car.price < 500000)
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(cars3elements);
 // [Car {name = 'Dodge', topSpeed = 250, price = 300000, rating = 4}, Car {name = 'Citroen', topSpeed = 180, price = 200000, rating = 3}, Car {name = 'Opel', topSpeed = 220, price = 150000, rating = 4}]
    }
}
