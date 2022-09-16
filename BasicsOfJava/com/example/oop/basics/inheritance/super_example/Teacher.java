package BasicsOfJava.com.example.oop.basics.inheritance.super_example;

public class Teacher extends Person{

    private String teachingSubject;  // np Math

    Teacher(String name, String surname, String teachingSubject)
    {
        super(name,surname);
        this.setTeachingSubject(teachingSubject); //  ustawiamy setter w parametrze, ktory zwroci nam wartosc z teachingSubject
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        teachingSubject = teachingSubject.toLowerCase(); // wrazie podania z duzej litery co uczy dany nauczuciel, bedziemy miec zgodnosc parametrow zapisanych a podanych

        switch (teachingSubject)
        {
            case "math":
            case "english":
            case "sport":
                this.teachingSubject = teachingSubject;
                break;
            default:
                this.teachingSubject = "unknown";
        }

    }
}
