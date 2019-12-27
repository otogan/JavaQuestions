package q11to20;

public class Q13 {
    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder(5);

        //sb ="" and s = ""

        String s = "";

//        String A= new String("A");
//        String B = new String("A");

//        System.out.println(A==B); //False
//        System.out.println(A.equals(B)); //True
//        System.out.println(A == B);//False
//        System.out.println(A.().equals(B.toString())); //True


        if (sb.equals(s)) {
            System.out.println("Match 1");

            //object.tostring --->  str
            // str ---> str

        } else if (sb.toString().equals(s.toString())) {
            System.out.println("Match 2");

        } else {
            System.out.println("No Match");

        }
    }
}
