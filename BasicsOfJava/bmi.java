package BasicsOfJava;

import java.lang.Math.*;

public class bmi {
    public static void main(String[] args) {
        double weight = 70;
        float height = 1.75f;
        float bmi = (float) (weight / Math.pow(height, 2));

        System.out.println(bmi);
        System.out.println((int)bmi);
    }
}
