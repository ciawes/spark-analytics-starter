package BasicsOfJava.com.example.oop.basics.inheritance.final_example;

class Employee
{
    String name;
    String surname;
    String jobTitle;
    float salary;
}

class Manager extends Employee
{
    String responibility;
}

class Director extends Manager
{
    String department;
}

class VicePresident extends Director
{

}
final class CEO extends VicePresident
{
    String companyName;
}
/*
class Something extends CEO
{
    Nie mozna rozszerzyc klasy final
}
*/
public class Test {
    public static void main(String[] args) {

        CEO ceo = new CEO();
    }
}
