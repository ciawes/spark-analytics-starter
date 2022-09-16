package BasicsOfJava.com.example.basics.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
        String str = dateTimeFormatter.format(localDateTime);
        System.out.println(str);

        // mozemy rowniez uzyc tej samej metody co wczesniej

        System.out.println(localDateTime.getDayOfMonth());

        // mozemy rowniez modyfikowac date

        localDateTime = localDateTime.plusYears(5);

        str = dateTimeFormatter.format(localDateTime);
        System.out.println(str);

        //System.out.println(localDateTime);

        }
}
