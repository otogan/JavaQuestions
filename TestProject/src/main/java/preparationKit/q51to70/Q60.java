package preparationKit.q51to70;

public class Q60 {

}

class Test extends Error{
     static boolean isAvailable = false;

     public static boolean doStuff() {
         return !isAvailable;
     }

    public static void main(String[] args) {
        Test ts = new Test();
        System.out.print(isAvailable + " ");
        isAvailable = ts.doStuff();
        System.out.println(isAvailable);
    }
}