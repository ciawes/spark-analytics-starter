package BasicsOfJava.com.example.collections;

import java.util.Comparator;
import java.util.PriorityQueue;

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length(); // posotuje wartosci od najkrutszej do najdluzszej
    }
}

public class PriorityQueueStringLengthComparator {
    public static void main(String[] args) {

        PriorityQueue<String> test = new PriorityQueue<>(new StringLengthComparator());
        test.add("Daniel");
        test.add("Ola");
        test.add("Zuzanna");
        test.add("Adam");
        test.add("Kasia");

        while (!test.isEmpty()) {
            System.out.println(test.poll());
        }
    }
}
