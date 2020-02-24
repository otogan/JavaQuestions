package preparationKit.q11to20;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q11 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2019, 12, 25);
        LocalDate date3 = LocalDate.parse("2019-12-25", DateTimeFormatter.ISO_DATE);
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
        System.out.println("date3 = " + date3);
    }
}
