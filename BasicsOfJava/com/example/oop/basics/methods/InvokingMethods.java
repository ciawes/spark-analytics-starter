package BasicsOfJava.com.example.oop.basics.methods;

class Triangle{
    float a; // dlugosc podstawy
    float h; // wysokosc trojkata
    float surfaceArea; // pole powierzchni

    Triangle(float base, float height){
        a = base;
        h = height;
        surfaceArea = (a * h) / 2;
    }
}

class  MyMath{

    public void add(int a, int b){
        //a = 20; // jesli zadeklaruje wartosc w metodzie wynik bedzie inny niz z wartosci ktore podalem na dole w main
        int result = a + b;
        System.out.println("result: " + result);
    }

    public void multiply(float a, float h){
        float surfaceArea = (a * h) / 2;
        System.out.println("result: " + surfaceArea);
    }
}

public class InvokingMethods {
    public static void main(String[] args) {

        MyMath math = new MyMath();
        int a = 10;
        int b = 7;
        math.add(a, b);

        Triangle triangle = new Triangle(10.0f,5.0f);

        float base = 25.0f;
        float height = 5.0f;
        math.multiply(base , height);


    }
}
