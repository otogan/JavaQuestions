package hackerRank;

public class RegExTest {
    public static void main(String[] args) {
        String s = "";
        s = s.trim();
        String[] list = s.split("[ !,?._'@]+");
        System.out.println(list.length);
        for (String i : list) {
            System.out.println(i);
        }
    }
}
