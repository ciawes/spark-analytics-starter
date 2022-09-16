package BasicsOfJava.com.example.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIteratorManipulation {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Adam");
        String p1 = "Ola";
        list.add(p1);
        list.addFirst("Rafal");
        list.addLast("Olek");

        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.equalsIgnoreCase("Ola")) {
                iterator.set("Zuza");
            }
            if (str.equalsIgnoreCase("Adam")) {
                iterator.add("Karol");
            }
            if (str.equalsIgnoreCase("Rafal")) {
                iterator.remove();
            }

          //  System.out.println(str);
            /* BEFORE IF STATEMENT:
                 Rafal    po if statement juz go nie bedzie                                     - ----
                 Adam     Adam zostaje na pierwszej pozycji                                     - Adam
                 Ola      Ola zostaje przesunieta w dol o jedna poz. i podmieniona na zuza      -
                                                                                                - Karol
                                                                                                - Zuza
                 Olek     zostaje przesuniety rowniez o jedna poz                               - Olek
             */
        }

        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        /* AFTER IF AND WHILE STATEMENT:
               Adam
               Karol
               Zuza
               Olek
         */

    }
}
