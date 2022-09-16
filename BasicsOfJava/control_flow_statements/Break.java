package BasicsOfJava.control_flow_statements;

public class Break {
    public static void main(String[] args) {

        for (int i = 0; i < 20; i++){
            System.out.println(i);
            if (i > 3) break;
        }
        System.out.println("Dalsza czesc programu ");

        int a = 10;
        while (a > 0){
            System.out.println(a);
            a--;

            if (a == 2) break;
        }
        System.out.println("Petla while zakonczona ");
    }
}
