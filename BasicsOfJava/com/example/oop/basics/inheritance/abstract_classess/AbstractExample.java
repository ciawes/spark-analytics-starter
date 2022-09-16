package BasicsOfJava.com.example.oop.basics.inheritance.abstract_classess;

public class AbstractExample {
    public static void main(String[] args) {

        Employee worker1 = new Employee("Krystian", "Czajkowski", 37);
        worker1.printInfo();

        Manager manager = new Manager("Maksymilian", "Czajkowskki", 14, "HouseMaster");
        manager.printInfo();

        Person person = manager;
        System.out.println(person.getName() + " " + person.getSurname() + " " + person.getAge() + " lat ");


    }
}
