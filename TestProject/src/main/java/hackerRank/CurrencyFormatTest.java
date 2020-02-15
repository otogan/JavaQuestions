package hackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CurrencyFormatTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat usCurrency = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaCurrency = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat chinaCurrency = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceCurrency = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        String us = usCurrency.format(payment);
        String india = indiaCurrency.format(payment);
        String china = chinaCurrency.format(payment);
        String france = franceCurrency.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}

