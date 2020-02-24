package preparationKit.q11to20;

public class Q18 {

    public static void main(String[] args) {

        StringBuilder s= new StringBuilder();

        s.append("1");
        s.append("2");
        s.append("3");
        s.append("4");

       // System.out.println(s.toString());

        System.out.println(s.delete(0,s.length()).length());


    }
}
