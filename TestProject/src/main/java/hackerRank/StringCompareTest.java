package hackerRank;

public class StringCompareTest {
    public static void main(String[] args) {
        String a = "java";
        String b = "hello";

        System.out.println(a.compareTo(b));
        System.out.println("".toCharArray().length);
        System.out.println(a.substring(0, 1).toUpperCase() + a.substring(1));
    }

    static String capitalize(String s) {
        char[] c = s.toCharArray();
        if (c.length > 0) {
            c[0] = Character.toUpperCase(c[0]);
        }
        return String.valueOf(c);
    }
}
