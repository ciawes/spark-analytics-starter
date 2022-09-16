package BasicsOfJava.data.string_class;

public class StringComparison {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "HELLo";

        if(s2.equals(s1)){
            System.out.println("s2 rowne s1 ");
        }

        if (s3.equals(s1)){
            System.out.println("s3 rowne s1"); // false
        }

        if (s1.equalsIgnoreCase(s3)){     //wyrazenie po kropce sprawdza czy oba warunki sa takie same ignorujac wielkosc liter
            System.out.println("s1 rowne s3 - wielkosc znakow jest ignorowana");
        }

    }
}
