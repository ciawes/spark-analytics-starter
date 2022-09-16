package BasicsOfJava.control_flow_statements;

public class WhileLoop {
    public static void main(String[] args) {

        int i = 10;

        while (i > 0){                // petla odliczaja ca do 0.
            System.out.println(i);
            i--;
        }
        System.out.println("*********************************************");


        int j = 1;

        while (j < 10 + 1 ){          // petla odliczajaca do 10.
            System.out.println(j);
            j++;
        }
    }
}
