package BasicsOfJava.com.example.generics;

import java.util.ArrayList;
import java.util.Iterator;

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

class Employee extends Person {
    private String jobTitle;

    public Employee(String name, String jobTitle) {
        super(name);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "name: " + this.getName() +
                " jobTitle = '" + jobTitle + '\'' +
                '}';
    }
}

class Contractor extends Employee {

    public Contractor(String name, String jobTitle) {
        super(name, jobTitle);
    }

    @Override
    public String toString() {
        return "Contractor { " + super.toString() + " }";
    }
}

class Organisation<T extends Person> {
    private ArrayList<T> participant;

    public Organisation() {
        participant = new ArrayList<T>();
    }

    public void addParticipant(T p) {
        participant.add(p);
    }

    public T getParticipant(int index) {
        return participant.get(index);
    }

    public void printParticipant() {
        Iterator<T> iter = participant.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}

public class OrganisationExample {
    public static void main(String[] args) {
        Organisation<Employee> organisation = new Organisation<>();
        organisation.addParticipant(new Employee("Krystian", "Programista"));
        organisation.addParticipant(new Employee("Kasia", "Sprzataczka"));
        organisation.addParticipant(new Contractor("Daniel", "Informatyk"));
        organisation.printParticipant();
        /*
            Employee {name: Krystian jobTitle = 'Programista'}
            Employee {name: Kasia jobTitle = 'Sprzataczka'}
            Contractor { Employee {name: Daniel jobTitle = 'Informatyk'} }
         */
    }
}
