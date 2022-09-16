package BasicsOfJava.com.example.basics.date;

import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfMonth());


        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getMonth());

        localDate = localDate.plusYears(10);
        localDate = localDate.minusMonths(3);
        localDate = localDate.plusDays(1);
        System.out.println("data po zmianach");

        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfMonth());

    }
}
