package BasicsOfJava.com.example.oop.basics.access_modifiers.no_modifier;

import BasicsOfJava.com.example.oop.basics.access_modifiers.no_modifier.package1.Laptop;
import BasicsOfJava.com.example.oop.basics.access_modifiers.no_modifier.package2.Computer;

public class NoModifierExample {
    public static void main(String[] args) {
        Computer computer = new Computer();
       // computer.name = "Krystian";  // Blad komp. poniewaz nie mamy dostepu do klasy z innego pakietu

        computer.setName("Krystian");  // mozliwe bo utworzono geter i seter

        System.out.println(computer.getName());

        Laptop laptop = new Laptop();

        System.out.println(laptop.getName());
    }
}
