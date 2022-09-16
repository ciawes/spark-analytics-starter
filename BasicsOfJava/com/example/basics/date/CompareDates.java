package BasicsOfJava.com.example.basics.date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CompareDates {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2020,9,10);
        LocalDate date2 = LocalDate.of(2021,9,10);

        if (date1.isAfter(date2)) {
            System.out.println("2020 > 2021");
        } else {
            System.out.println("2020 nie jest wieksze od 2022");
        }

        if (date2.isBefore(date1)) {
            System.out.println("2020 < 2022");
        } else {
            System.out.println("2020 jest mniejsze od 2022");
        }

        if (date1 == date2) {
            System.out.println("2020 != 2021");
        } else {
            System.out.println("2020 nie jest rowne 2022");
        }

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.of(2055,12,24,15,45);

        if (localDateTime1.isAfter(localDateTime)) {
            System.out.println("localDateTime1 > localDateTime");
            System.out.println("data z przyszlosci jest data po dacie dzisiejszej");
        } else {
            System.out.println("localDateTime1 < localDateTime");
            System.out.println("data z pzryszlosci nie jest po dacie dzisiejszej");

        }
    }
}
