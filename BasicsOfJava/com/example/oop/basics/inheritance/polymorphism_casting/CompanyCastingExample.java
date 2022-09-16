package BasicsOfJava.com.example.oop.basics.inheritance.polymorphism_casting;

import BasicsOfJava.com.example.oop.basics.inheritance.polymorphism_basics.Ceo;
import BasicsOfJava.com.example.oop.basics.inheritance.polymorphism_basics.Employee;
import BasicsOfJava.com.example.oop.basics.inheritance.polymorphism_basics.Manager;

public class CompanyCastingExample {              // RZUTOWANIE!!!!!
    public static void main(String[] args) {

        Employee employee = new Employee("Adam", "Programmer", 10000);
        Manager manager = new Manager("Kasia", "Team Leader", 50000, "R&D");
        Employee employeeCeo = new Ceo("Rafal", "Prezes", 2000, "Board", 100);

       // employeeCeo.signContract();  // blad kompilacji, brak dostepu do metody signContract z poziomu emploee

        if (employeeCeo instanceof Ceo)
        {
            Ceo ceo = (Ceo) employeeCeo;   // rzutowanie, po dodaniu przedroostka (Ceo) do employeeCeo, mamy dostep do metody signContract()
            ceo.signContract();
        }


    }
}
