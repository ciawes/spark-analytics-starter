package BasicsOfJava.operators;

public class Op2_incrementation {
    public static void main(String[] args) {
        int a= 10;
        ++a;
        System.out.println(a);

        int b = 5;
        int c = 10 + ++b;
        int d = c;
        System.out.println("c: " + c);
        System.out.println("b: " + b);
        System.out.println("c po konversji: " + d);
    }
}
