package hackerRank;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class GradingStudents {
    public static List<Integer> gradeStudents(List<Integer> grades) {
        // Write your code here
        ListIterator<Integer> iterator = grades.listIterator();
        while (iterator.hasNext()) {
            int i = iterator.nextIndex();
            int n = iterator.next();
            if (n >= 38) {
                int diff = n % 5;
                if (diff > 2) grades.set(i, n + 5 - diff);
            }
        }
        return grades;
    }

    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(4, 73, 67, 38, 33);
        System.out.println(gradeStudents(grades));
    }

}
