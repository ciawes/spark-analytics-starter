package BasicsOfJava.com.example.oop.basics.inner_class;

public class PublicStaticInnerClass {
    public static void main(String[] args) {

        CarObj car = new CarObj.CarObjBuilder().srtModelName("T")
                .setManufacturer("Ford")
                .setYear(1920)
                .getCar();


        System.out.println(car.toString());
    }
}
