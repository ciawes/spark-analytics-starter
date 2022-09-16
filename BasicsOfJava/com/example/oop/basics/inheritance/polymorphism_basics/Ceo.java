package BasicsOfJava.com.example.oop.basics.inheritance.polymorphism_basics;

public class Ceo extends Manager{

    private int sharesNumber;

    public Ceo() {
        sharesNumber = 100;
    }

    public Ceo(String name, String jobTitle, int salary, String departmentName, int sharesNumber) {
        super(name, jobTitle, salary, departmentName);
        this.sharesNumber = sharesNumber;
    }

    public void signContract()
    {
        System.out.println("Contract signed! ");
    }

    public int getSharesNumber() {
        return sharesNumber;
    }

    public void setSharesNumber(int sharesNumber) {
        this.sharesNumber = sharesNumber;
    }

    public void printInfo()
    {
        System.out.println("Coe: " + getName());
    }
}
