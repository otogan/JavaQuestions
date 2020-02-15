package hackerRank;

import java.math.BigInteger;

public class BigIntegerPrime {
    public static void main(String[] args) {
        String n = "13";
        BigInteger bi = new BigInteger(n);
        bi = BigInteger.valueOf(45);
        System.out.println(bi.isProbablePrime(10));
    }
}
