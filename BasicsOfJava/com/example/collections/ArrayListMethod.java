package BasicsOfJava.com.example.collections;

import java.util.ArrayList;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person { " +
                "name = '" + name + '\'' +
                '}';
    }
}

public class ArrayListMethod {
    public static void main(String[] args) {

        Person p1 = new Person("Krystian");
        Person p2 = new Person("Marta");
        Person p3 = new Person("Maksiu");

        ArrayList<Person> arr1 = new ArrayList<>();
        arr1.add(p1);
        arr1.add(p2);
        arr1.add(p3);

        for (Person p: arr1) {
           // System.out.println(p);
        }

        Person p4 = new Person("Dawid");
        Person p5 = new Person("Agnieszka");

        ArrayList<Person> arr2 = new ArrayList<>();
        arr2.add(p4);
        arr2.add(p5);

        arr1.addAll(arr2);

        for (Person p: arr1) {
            System.out.println(p);
        }

        if (arr1.contains(p2)) {
            System.out.println(" yes it is");
        }

        if (arr1.containsAll(arr2)) {
            System.out.println("posiada elementy arr2");
        }

        Person p7 = new Person("koszmar");
        arr2.add(p7);

        if (arr1.containsAll(arr2)) {
            System.out.println("arr1 posiada elementy arr2");
        } else {
            System.out.println("arr1 nie posiada wszystkich elementow arr2");
        }

        arr2.remove(p7);
        if (arr1.containsAll(arr2)) {
            System.out.println("arr1 posiada wszystkie elementy arr2");
        } else {
            System.out.println("arr1 nie posiada wszystkich elementow arr2");
        }

        arr1.removeAll(arr2);

        if (arr1.containsAll(arr2)) {
            System.out.println("arr1 posiada elementy arr2");
        } else {
            System.out.println("arr1 nie posiada wszystkich elementow arr2");
        }

        for (Person p: arr2) {
            System.out.println(p);
        }

        Person[] people = new Person[arr1.size()];
        people = arr1.toArray(people);
        System.out.println(people.length);

        arr1.clear();
        if (arr1.isEmpty()) {
            System.out.println("kolekcja pusta");
        }
    }
}
