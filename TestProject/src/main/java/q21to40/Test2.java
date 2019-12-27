package q21to40;

public class Test2 {
    public static void main(String[] args) {
        String a = "Thomas";
//        a.substring()
        StringBuilder sb = new StringBuilder("123-456-789");
//        sb.substring(4, 8);
//        System.out.println(sb.append("1234-5678", 4, 9).toString());
        String x = "XXXX-XXXX-";
        StringBuilder s = sb.insert(1, x);
        System.out.println(s.toString());
        System.out.println(sb.toString());
    }
}
