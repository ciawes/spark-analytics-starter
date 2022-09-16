package BasicsOfJava.com.example.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListBasics {
    public static void main(String[] args) {

        ArrayList basicList = new ArrayList<>();
        basicList.add(new String("test"));
        basicList.add("info");

        String strEl = (String) basicList.get(0);
        // System.out.println(strEl);

        ArrayList<String> arrStr = new ArrayList<>();
        arrStr.add("Kasia");
        arrStr.add("Dominik");
        arrStr.add("Bozena");
        arrStr.add("Dominika");
        System.out.println("wszystkie osoby ktore dodalem:");
        System.out.println(arrStr);

        for (String s: arrStr) {
            System.out.println(s);
        }

        /*
        Kasia
        Dominik
        Bozena
        Dominika
         */

        System.out.println();
        arrStr.remove(1);
        arrStr.add("Bozena 2");
        System.out.println("Osoby ktore wczesniej dodalem i usunalem osobe z indexu 1: Dominik i  dodalem bozena 2");
        System.out.println(arrStr);

        for (String s: arrStr) {
            System.out.println(s);
        }

        /* Kasia
           Bozena
           Dominika
           Bozena 2
        */

        System.out.println();

        System.out.println("Dodajemy kolejna osobe do zbioru Marta do indexu 1 e reszta po tym indexie przesuwa sie dalej");
       arrStr.add(1,"Marta");
        System.out.println(arrStr);

        for (String s: arrStr) {
            System.out.println(s);
        }

        /*
            Kasia
            Marta
            Bozena
            Dominika
            Bozena 2
        */

        System.out.println();
        System.out.println("Ustawiamy Konrad do indexu 2 wiec Bozeny nie bedzie");
        arrStr.set(2,"Konrad");
        System.out.println(arrStr);

        for (String s: arrStr) {
            System.out.println(s);
        }

        /*
            Kasia
            Marta
            Konrad
            Dominika
            Bozena 2
        */

        System.out.println();
        System.out.println("Sortujemy dane w tablicy");
        Collections.sort(arrStr);

        for (String s: arrStr) {
            System.out.println(s);
        }

        /*
            Bozena 2
            Dominika
            Kasia
            Konrad
            Marta
         */


    }

}
