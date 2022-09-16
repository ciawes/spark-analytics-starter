package BasicsOfJava.com.example.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetBasics {
    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(56);
        treeSet.add(4);
        treeSet.add(23);
        treeSet.add(1);

        System.out.println("Sortowanie od najmniejszej");
        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            //iterator.next();
            System.out.println(iterator.next());  // wynik bedzie zawsze posortowany od najmniejszej do najwiekszej cyfry: 1, 4, 23, 56
        }

        System.out.println("Sortowanie od najwiekszej");
        Iterator<Integer> descendingIterator = treeSet.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next()); // wynik bedzie zawsze posortowany od najwiekszej do najmniejszej cyfry: 56, 23, 4, 1
        }


    }
}
