package BasicsOfJava.control_flow_statements;

public class Main {
    public static void main(String[] args) {
        int a = 0;

        if (a < 0){
            System.out.println("a jest liczba ujemna ");
        } else if (a ==0)
        {
            System.out.println("a jest rowne 0");
        } else {
            System.out.println("a jest liczba dodatnia");
        }
    }
}