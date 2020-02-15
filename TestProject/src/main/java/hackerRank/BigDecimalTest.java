package hackerRank;

import java.math.BigDecimal;
import java.util.*;

public class BigDecimalTest {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        //Write your code here
        int ln = s.length;
        BigDecimal[] bd = new BigDecimal[ln - 2];
        for (int i = 0; i < ln - 2; i++) {
            String temp = s[i].replaceAll("(\r\n|[\n\r\u2028\u2029\u0085\u202D\u202C])?", "");
            bd[i] = new BigDecimal(temp);
        }

        for (int i = 1; i < ln; i++) {
            BigDecimal key = bd[i];
            String strKey = s[i];
            int j = i - 1;

            while (j >= 0 && bd[j].compareTo(key) == 1) {
                bd[j + 1] = bd[j];
                s[j + 1] = s[j];
                j--;
            }
            s[j + 1] = strKey;
            bd[j + 1] = key;
        }


        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}

class BDTest2 {
    public static void main(String[] args) {
        BigDecimal bg1 = new BigDecimal("100");
        BigDecimal bg2 = new BigDecimal("200");
        System.out.println(bg1.compareTo(bg2));
    }
}