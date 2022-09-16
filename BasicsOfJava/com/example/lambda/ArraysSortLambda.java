package BasicsOfJava.com.example.lambda;

import java.util.Arrays;

public class ArraysSortLambda {
    public static void main(String[] args) {

        String[] arrStr = {"Ford", "Bmw", "Mercedes", "Dodge"};

        Arrays.sort(arrStr, (a,b) -> {return a.length() - b.length();} );
        for (String s: arrStr){
            System.out.println(s);
        }

    }
}
