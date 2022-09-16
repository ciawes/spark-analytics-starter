package BasicsOfJava.control_flow_statements;

public class IfStatement {
    public static void main(String[] args) {
        int a = 1;
        if (a > 5){
            System.out.println("a jest wieksze od 5");
        } else if (a == 2){
            System.out.println(" a jest rowne 2");
        } else {
            System.out.println("a nie jest wieksze od 5 i nie jest rowna 2");
        }
    }
}
