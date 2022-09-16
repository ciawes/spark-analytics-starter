package BasicsOfJava.com.example.oop.basics.inheritance.super_example;

public final class Director extends Person{

    private int officeNumber;

    public Director(String name, String surname, int officeNumber) {
        super(name, surname);
        this.officeNumber = officeNumber;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }
}
