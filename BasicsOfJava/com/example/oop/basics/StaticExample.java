package BasicsOfJava.com.example.oop.basics;

class PlaneWithStatic{
    static int nextId = 0;

    int id;
    int x, y;

    static int getNextId(){
        return nextId++;
    }

    PlaneWithStatic(){
        id = nextId;  // mozna rowniez odwolac sie w ten sposob PlaneWithStatic.nextId;
        nextId++;
    }
}

public class StaticExample {
    public static void main(String[] args) {

        PlaneWithStatic plane1 = new PlaneWithStatic();
        PlaneWithStatic plane2 = new PlaneWithStatic();
        PlaneWithStatic plane3 = new PlaneWithStatic();


        System.out.println("plane1.id: " + plane1.id);
        System.out.println("plane2.id: " + plane2.id);
        System.out.println("plane3.id: " + plane3.id);
    }
}
