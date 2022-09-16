package BasicsOfJava.com.example.oop.basics.interface_extends_default_final_method;

public interface Eating {

    public void eat();

    public default void searchForFood()
    {
        System.out.println("Searching for food ");
    }
}
