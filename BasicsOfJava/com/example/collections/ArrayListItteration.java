package BasicsOfJava.com.example.collections;

import java.util.ArrayList;
import java.util.Iterator;

class Car{
    private String name, manufacturer;
    private int year;

    public Car(String name, String manufacturer, int year) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                '}';
    }
}

public class ArrayListItteration {
    public static void main(String[] args) {


        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car(" Charger ", " Ford ", 1970));
        cars.add(new Car(" Mustang ", " Ford ", 1985));
        cars.add(new Car(" Crown Victoria ", " Ford ", 1961));

        System.out.println();
        System.out.println("Petla for");
        for ( int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            System.out.println(car);
        }
        System.out.println();
        System.out.println("petla for each");
        for (Car car: cars) {
            System.out.println(car);
        }

        System.out.println("\n Iterator:");
        Iterator<Car> iterator = cars.iterator();
        while (iterator.hasNext()) {
            Car car = iterator.next();
            System.out.println(car);
        }


    }
}
