package BasicsOfJava.com.example.lambda;

@FunctionalInterface
interface MathInterface {
    int operate(int a, int b);

    default int add(int a, int b) {
        return a + b;
    }

    default int substract(int a, int b) {
        return  a - b;
    }

    default int multiply(int a, int b) {
        return a * b;
    }

    default int divide(int a, int b) {
        return a / b;
    }

}

class MathClass implements MathInterface {

    @Override
    public int multiply(int a, int b) {
        System.out.println("MathClass.multiply()");
        return a * b;
    }

    @Override
    public int operate(int a, int b) {
        System.out.println("MathClass.operate()");
        return a + b;
    }

    @Override
    public int add(int a, int b) {
        System.out.println("MathClass.add()");
        return MathInterface.super.add(a, b);
    }
}

public class DefaultMethodsInterface {
    public static void main(String[] args) {

        MathInterface math = (int a, int b) -> a * b;

        System.out.println(math.operate(10, 30)); // 300

        System.out.println(math.divide(100, 4));  // 25

        System.out.println(math.add(10, 15));  //  25

        MathClass mathClass = new MathClass();  // MathClass.operate()
        System.out.println(mathClass.operate(100, 100)); // 200
        System.out.println(mathClass.multiply(20, 20));  // 400
        System.out.println(mathClass.substract(300, 150)); // 150
        System.out.println(mathClass.add(22, 3));  //  MathClass.add() wunik: 25
    }
}
