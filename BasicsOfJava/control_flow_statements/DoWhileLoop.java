package BasicsOfJava.control_flow_statements;

public class DoWhileLoop {
    public static void main(String[] args) {
        int a = 1;

        do {
            System.out.println(a * 2); // wykonaj dzialanie
            a++;                       // dopuki nie spelniony zostanie warunek, czyli "a" musi osiagnac
        } while (a < 10 + 1);          // wartosc 10 aby petla skonczyla swoje dzialanie.

        System.out.println("*****************************************************************");


        int b = 10;

        do {
            System.out.println(b * 2); // wykonaj dzialanie
            b--;                       // dopuki nie spelniony zostanie warunek, czyli "b" musi osiagnac
        } while (b > 0);               // wartosc 0 aby petla skonczyla swoje dzialanie.




    }


}


