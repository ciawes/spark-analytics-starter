package BasicsOfJava.com.example.basics.date;

import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        System.out.println("Godzina: " + localTime.getHour());
        System.out.println("Minuta: " + localTime.getMinute());
        System.out.println("Sekundy: " + localTime.getSecond() );

        localTime = localTime.plusHours(10);
        localTime = localTime.plusMinutes(10);
        localTime = localTime.plusSeconds(10);

        System.out.println("po zmianie");

        System.out.println("Godzina: " + localTime.getHour());
        System.out.println("Minuta: " + localTime.getMinute());
        System.out.println("Sekundy: " + localTime.getSecond() );

    }
}
