package BasicsOfJava.operators;

public class Op1_basics {
    public static void main(String[] args) {
        int a = 10;
        int b, c;

        c = b = a + 5;

        System.out.println("c: " + c + " b: " + b);

        int v = (100 * 2) / 5 + 20;
        System.out.println(v);
        System.out.println(20 % 7);
    }
}
