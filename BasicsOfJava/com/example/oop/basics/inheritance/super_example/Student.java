package BasicsOfJava.com.example.oop.basics.inheritance.super_example;

public class Student extends Person{

    private int grade;  // rocznik np 1

    Student()
    {

    }

    Student(String name, String surname, int grade)
    {
        super(name, surname);  // super wywoluje dane wartosci z klasy nadrzednej, zamiast pisac " this.name = name; "
        this.setType("Studencik");
        this.setGrade(grade); // do sprawdzenia warunku podanego w setGrade, ustawiamy setter z wartoscia grade
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade > 0 && grade < 8) // sprawdzany warunek czy grade nie ma podanej specjalnie zlej wartosci, wiec ustawiamy warunek miedzy klasa 1 a 8
            this.grade = grade;
    }
}


