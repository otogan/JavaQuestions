package hackerRank;

import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class IntegerTest {
    public static void main(String[] args) {
        try {
            testInput(3, 5);
        }
        catch (Exception e) {

        }
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            String s = "";
            try {
                s = sc.next().replaceAll("(\r\n|[\n\r\u2028\u2029\u0085\u202D\u202C])?", "");
                long x = Long.parseLong(s);
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) System.out.println("* byte");
                if (x >= (long) -Math.pow(2, 15) && x < (long) Math.pow(2, 15))
                    System.out.println("* short");
                if (x >= (long) -Math.pow(2, 31) && x < (long) Math.pow(2, 31))
                    System.out.println("* int");
                if (x >= (long) -Math.pow(2, 63) && x <= (long) Math.pow(2, 63))
                    System.out.println("* long");
            } catch (Exception e) {
                System.out.println(s + " can't be fitted anywhere.");
            }
            StringBuilder sb = new StringBuilder();
            List list = new ArrayList();
        }
    }

    static void testInput(int b, int h) throws Exception {
        Exception e = new Exception("Message");
        throw e;
    }
}
