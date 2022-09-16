package BasicsOfJava.com.example.oop.basics.inheritance.abstract_classess;

public class Manager extends Employee{

    private String departmentName;

    public Manager(String name, String surname, int age, String departmentName) {
        super(name, surname, age);
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
