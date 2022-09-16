package BasicsOfJava.com.example.collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListBasics {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Adam");
        String p1 = "Ola";
        list.add(p1);
        list.addFirst("Rafal");
        list.addLast("Olek");

        System.out.println(list);   // [Rafal, Adam, Ola, Olek]


        System.out.println(list.getFirst()); // Rafal
        System.out.println(list.getLast());  // Olek

        list.removeLast();
        list.removeFirst();

        System.out.println(list);  //  [Adam, Ola]

        System.out.println(list.contains(p1)); // true
        list.add("Daniel");
        list.add("Kuba");
        list.add(p1);
        list.add("Ania");

        list.removeFirstOccurrence(p1);
        list.removeLastOccurrence("Ania");

        System.out.println(list);  // [Adam, Daniel, Kuba, Ola]

        list.add(2,"Zenon");
        list.set(0, "Katarzyna");
        System.out.println(list.size());   // 5

        ListIterator<String> iterator1 = list.listIterator();
        while (iterator1.hasNext()){
            String str = iterator1.next();
            System.out.println(str);   /*
                                          Katarzyna
                                          Daniel
                                          Zenon
                                          Kuba
                                          Ola
                                                  */

        }
        System.out.println();
        System.out.println("Iteracja odwrocona:");
        System.out.println();

        ListIterator<String> iterator2 = list.listIterator(list.size());
        while (iterator2.hasPrevious()) {
            String str = iterator2.previous();
            System.out.println(str);
            /*    Ola
                  Kuba
                  Zenon
                  Daniel
                  Katarzyna
             */

        }


    }
}
