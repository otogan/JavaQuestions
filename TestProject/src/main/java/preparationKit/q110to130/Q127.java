package preparationKit.q110to130;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q127 {
    public static void main(String[] args) {
        String date = LocalDate.parse("2014-05-04T00:00:00.000").format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(date);
    }

}
