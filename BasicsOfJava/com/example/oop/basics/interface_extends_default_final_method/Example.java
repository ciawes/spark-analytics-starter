package BasicsOfJava.com.example.oop.basics.interface_extends_default_final_method;

public class Example {
    public static void main(String[] args) {

        Parrot parrot = new Parrot();
        parrot.fly();
        System.out.println(parrot.getNumLegs());
        parrot.searchForFood();
        System.out.println(parrot.getWingspan() + "cm");
        System.out.println("Default number of wings: " + Flying.getDefaultNumWings());

        /* W interfejsach nie musimy podawac public static, wystarczy samo static, poniewaz interfejsy maja
        * wszystkie wartosci statyczne  */

    }
}
