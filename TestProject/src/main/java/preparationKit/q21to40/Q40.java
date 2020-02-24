package preparationKit.q21to40;

import java.util.ArrayList;

public class Q40 {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        String[] myArray;
        try {
            while (true) {
                myList.add("My String");
            }
        }
        catch (RuntimeException re) {
            System.out.println("Caught a RuntimeException");
        }
        catch (Exception e) {
            System.out.println("Caught an Exception");
        }
        catch (OutOfMemoryError me) {
            System.out.println("Caught a OutOfMemoryException");
        }
        System.out.println("Ready to use");
    }
}
