package BasicsOfJava.com.example.oop.basics.inheritance.example2_shop;

public class Computer extends Product{

    public Mouse mouse;
    public Monitor monitor;
    public Keyboard keyboard;
    Computer(){
        mouse = new Mouse();
        monitor = new Monitor();
        keyboard = new Keyboard();

        price = 4500.0f;
    }
}
