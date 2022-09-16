package BasicsOfJava.com.example.oop.basics.access_modifiers.getters_setters;

public class GetSetExample {
    public static void main(String[] args) {

        TestClass testClass = new TestClass();
        testClass.setName("Krystian");
        System.out.println(testClass.getName());
    }
}
