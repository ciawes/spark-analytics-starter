package BasicsOfJava.programs;

import java.util.Scanner;

// procent skladany
//1000 * (1 + 0.05)^3

public class CompoundInterest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double startCapital = 0;
        double yearlyInterest = 0;
        int numYears = 0;

        double finalCapital; // rezultat oszczedzania

        System.out.println("Wpisz kapital poczatkowy: ");
        startCapital = Double.valueOf(in.nextLine()).doubleValue();

        System.out.println("Wpisz roczne oprocentowanie np. 5 to 5%: ");
        yearlyInterest = Double.valueOf(in.nextLine()).doubleValue();

        System.out.println("Wpisz ilosc lat oszczedzania: ");
        numYears = in.nextInt();

        finalCapital = startCapital * Math.pow(1 + (yearlyInterest / 100.0d), numYears);

        System.out.println("Efekt oszczedzania z procentek skladanym: " + Math.round(finalCapital));

    }
}
