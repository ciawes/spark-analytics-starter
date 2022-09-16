package BasicsOfJava.com.example.oop.basics.access_modifiers.public_example;

import BasicsOfJava.com.example.oop.basics.access_modifiers.public_example.package1.BasicClass;
import BasicsOfJava.com.example.oop.basics.access_modifiers.public_example.package2.OtherClass;

public class Test {
    public static void main(String[] args) {
        BasicClass basicClass = new BasicClass();
        basicClass.name = "bobo";

        OtherClass otherClass = new OtherClass();
    }
}
