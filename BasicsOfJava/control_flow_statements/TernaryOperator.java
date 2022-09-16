package BasicsOfJava.control_flow_statements;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 2;
        int b = (a > 3) ? 100 : 9;

        System.out.println("b: " + b); // jesli warunek jest spelniony to "?" przypisuje wartosc 100 do "b"
                                       // a jesli spelni sie to ":" przypisze wartosc 9
        // to samo jako if else
        if (a > 3) {
              b = 100;
          } else {
            b = 9;
          }
        System.out.println(b);


          }


    }

