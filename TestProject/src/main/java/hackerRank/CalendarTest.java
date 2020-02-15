package hackerRank;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2020, 0, 19);
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
    }
}
