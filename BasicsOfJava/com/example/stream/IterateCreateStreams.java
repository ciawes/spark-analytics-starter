package BasicsOfJava.com.example.stream;

import java.util.stream.Stream;

public class IterateCreateStreams {
    public static void main(String[] args) {

        Stream.iterate(1, n -> n + 1).limit(10)
                .forEach(s -> System.out.println(s));
        /*
             1
             2
             3
             4
             5
             6
             7
             8
             9
             10
         */

        System.out.println("\n");

        Stream.iterate(0, n -> n < 5, n -> n + 1)
                .forEach(d -> System.out.println(d));

        /*
             0
             1
             2
             3
             4
         */
    }
}
