package q11to20;

public class Q20 {
    char c; // = '\u0000';

    String printAll;
    boolean b;
    float f;
    void printAll() {
        System.out.println("c = " + c);
        System.out.println("b = " + b);
        System.out.println("f = " + f);
        System.out.println("p = " + printAll);
    }

    public static void main(String[] args) {
        Q20 f = new Q20();
        f.printAll();
    }

}
