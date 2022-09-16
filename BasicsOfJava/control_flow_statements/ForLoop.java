package BasicsOfJava.control_flow_statements;

public class ForLoop {
    public static void main(String[] args) {
        int arr[] = {1, 5, 10, 15, 20};

        for (int i = 0; i < arr.length; i +=2){ // jak dlugo ma dzialac petla
            int value = arr[i]; // tworzymy nowa zmienna w ktorej bedziemy zapisywac efekt wykonania petli
            System.out.println("arr " + value);
        }


        String names[] = {"Ola", "Adam", "Kasia"};

        for (int i = names.length - 1; i >= 0; i--){
            String names2 = names[i]; // petla bedzie wyswietlac tablice od tylu
            System.out.println(names2);
        }
    }

}
