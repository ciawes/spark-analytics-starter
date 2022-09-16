package BasicsOfJava.com.example.oop.basics.inheritance.super_example;

public class Person {

    private String name, surname;
    private String type;  //  student, dyrektor

    public Person()
    {

    }

    public Person(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
        this.type = "Person";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
