package BasicsOfJava.com.example.oop.basics.inner_class;


public class Example {
    public static void main(String[] args) {

        SomeExample someExample = new SomeExample();
        someExample.run();

        SomeExample.PubClass pubClass = someExample.new PubClass();
        pubClass.printInfo();



    }
}
