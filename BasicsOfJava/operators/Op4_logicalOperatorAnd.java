package BasicsOfJava.operators;

public class Op4_logicalOperatorAnd {
    public static void main(String[] args) {
        //Koniunkcja - operator logiczny, inaczej And

        System.out.println(5 < 10 && 20 >= 15); //TRUE && true. Wynik true bo oba warunki sa spelnione
        System.out.println(5 > 10 && 20 > 15);  // FALSE && true. wynik false bo oba warunki nie sa spelnione
        System.out.println(4 > 2 && 10 == 11);   // TRUE && false.
        System.out.println(4 == 2 && 12 > 20);   // FALSE && false. Wynik false bo oba warunki sa spelnione


    }
}
