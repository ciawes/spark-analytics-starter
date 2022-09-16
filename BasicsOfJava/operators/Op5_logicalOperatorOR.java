package BasicsOfJava.operators;

public class Op5_logicalOperatorOR {
    public static void main(String[] args) {
        //  Operator logiczny alternatywa, inaczej lub or
        // true || true wynik true
        // true || false wynik true
        // false || true wynik true
        // false || false wynik false

        System.out.println(10 > 2 || 5 >= 1);  //true
        System.out.println(10 > 8 || 1 == 10); // true
        System.out.println(3 < 8 || 1 == 1);   // true
        System.out.println(4 > 5 || 2 <= 1);   // false

    }
}
