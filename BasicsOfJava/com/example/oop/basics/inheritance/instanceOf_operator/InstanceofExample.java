package BasicsOfJava.com.example.oop.basics.inheritance.instanceOf_operator;

public class InstanceofExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        boolean result = dog instanceof Animal;
        System.out.println("dog instanceof Animal ");
        System.out.println(result);

        Animal animal = new Animal();
        System.out.println("animal instanceof Dog ");
        System.out.println(animal instanceof Dog);

        Bird bird = new Bird();
        System.out.println("bird instanceof Bird ");
        System.out.println(bird instanceof Bird);
        System.out.println("bird instanceof Animal ");
        System.out.println(bird instanceof Animal);

        Parrot parrot = new Parrot();
        System.out.println("parrot instanceof Bird ");
        System.out.println(parrot instanceof Bird);
        System.out.println("parrot instanceof Animal");
        System.out.println(parrot instanceof Animal);
        System.out.println("parrot instanceof Parrot");
        System.out.println(parrot instanceof Parrot);
    }
}
