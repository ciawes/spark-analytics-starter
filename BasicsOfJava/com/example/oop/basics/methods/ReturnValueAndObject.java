package BasicsOfJava.com.example.oop.basics.methods;

class  Circle{
    float radius;

    Circle(float r){
        radius = r;
    }
}

class MathMethods{
    public int add(int a, int b){
        return a + b;
    }
    public int substract(int a, int b){
        return a - b;
    }
    public int multiply(int a, int b){
        return a * b;
    }
    public int devide(int a, int b){
        return a / b;
    }

    public Circle getNewCircle(float radius){
        Circle c = new Circle(radius);
        return c;
    }
}

public class ReturnValueAndObject {
    public static void main(String[] args) {
        MathMethods math = new MathMethods();
        int a = 12;
        int b = 3;
        int result = 0;

        result = math.add(a, b);
        System.out.println(a + " + " + b + " = " + result);
        result = math.substract(a, b);
        System.out.println(a + " - " + b + " = " + result);
        result = math.multiply(a, b);
        System.out.println(a + " * " + b + " = " + result);
        result = math.devide(a, b);
        System.out.println(a + " / " + b + " = " + result);

        Circle circle = math.getNewCircle(10.0f);
        System.out.println("radius: " + circle.radius);

    }
}
