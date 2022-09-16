package BasicsOfJava.com.example.oop.basics.inheritance.polymorphism_basics;

public class Company {
    public static void main(String[] args) {

        Employee employee = new Employee("Adam", "Programmer", 10000);


        Manager manager = new Manager("Kasia", "Team Leader", 50000, "R&D");


        Ceo ceo = new Ceo("Rafal", "Prezes", 2000, "Board", 100);


        Employee worker = ceo;
        worker.doWork();
        worker.printInfo();   // Ceo: Rafal z klasy Ceo, wiazanie dynamiczne
        ceo.printInfo();      // Ceo: Rafal z klasy Ceo, wiazanie dynamiczne


        Manager person = ceo;
        person.getDepartmentName();
        person.printInfo();   // Ceo: Rafal z klasy Ceo, wiazanie dynamiczne
    }
}
