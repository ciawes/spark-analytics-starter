package BasicsOfJava.com.example.oop.basics.interface_basics;

public interface Vehicle {
    public void move();
    public void stop();
    public abstract void turn();  // niemusimy dodawac abstract poniewaz interface jest abstrakcja
    public float getTopSpeed();



}
