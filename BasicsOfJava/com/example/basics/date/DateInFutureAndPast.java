package BasicsOfJava.com.example.basics.date;

import java.util.Calendar;
import java.util.Date;

public class DateInFutureAndPast {
    public static void main(String[] args) {
        Date dateNow = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateNow);

        calendar.add(Calendar.DAY_OF_MONTH, 1); // nazwa dnia tygodnia + 1
        calendar.add(Calendar.MONTH, 1); // nazwa miesiaca +1
        calendar.add(Calendar.YEAR, 1);  // rok
        calendar.add(Calendar.HOUR, 0);
        calendar.add(Calendar.MINUTE, 0);
        calendar.add(Calendar.SECOND, 0);

        Date dateInFuture = calendar.getTime();
        System.out.println(dateInFuture);
    }
}
