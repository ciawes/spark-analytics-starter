package BasicsOfJava.com.example.oop.basics.access_modifiers.no_modifier.package2;

import BasicsOfJava.com.example.oop.basics.access_modifiers.no_modifier.package1.Product;

public class Computer extends Product {

    public Computer()
    {
        // name = "Computer";  // spowoduje blad, brak dostepu do zmiennej z innego pakietu, gdy nie ma modyfikatora

    }
}
