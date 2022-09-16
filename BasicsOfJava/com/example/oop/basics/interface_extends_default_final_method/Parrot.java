package BasicsOfJava.com.example.oop.basics.interface_extends_default_final_method;

public class Parrot implements Bird{

    @Override
    public int getNumLegs() {
        return 2;
    }

    @Override
    public void searchForFood() {
        System.out.println("Parrot is searching for food and it's quite happy with that");
    }

    @Override
    public String getName() {
        return "Parrot";
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }
}
