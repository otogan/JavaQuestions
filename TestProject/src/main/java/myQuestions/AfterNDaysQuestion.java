package myQuestions;

import java.util.*;

public class AfterNDaysQuestion {
    public static void main(String[] args) {
        String today = "Monday";
        int increase = -3;
        System.out.println("Today is " + today);

        System.out.println("After " + increase + " days, it's " + addDays(today, increase));
    }

    public static String addDays(String today, int increase) {
        String[] daysArray = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        List<String> days = Arrays.asList(daysArray);

        int currentDay = days.indexOf(today);

        if (currentDay < 0) {
            System.out.println("Invalid entry");
            return "";
        }

        currentDay += increase;
        currentDay %= 7;
        currentDay = currentDay < 0 ? currentDay + 7 : currentDay;
        return days.get(currentDay);
    }
}
