package BasicsOfJava.com.example.oop.basics.object_example;

public class CarObject {

    private String manufacturer;
    private String model;
    private int year;


    public CarObject(String manufacturer, String model, int year) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "CarObject { " +
                "manufacturer = '" + manufacturer + '\'' +
                ", model = '" + model + '\'' +
                ", year = " + year +
                '}';
    }
}
