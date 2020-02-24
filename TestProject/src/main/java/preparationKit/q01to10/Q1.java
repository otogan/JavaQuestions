package preparationKit.q01to10;

public class Q1 {
    public void test() {
        System.out.println("Base ");
    }

    public static void main(String[] args) {
        Q1 b1 = new DerivedB();
        Q1 b2 = new DerivedA();
        Q1 b3 = new DerivedB();
        b1 = (Q1) b3;
        Q1 b4 = (DerivedA) b3;
        b1.test();
        b4.test();
    }
}

class DerivedA extends Q1 {
    public void test() {
        System.out.println("DerivedA ");
    }
}

class DerivedB extends DerivedA {
    public void test() {
        System.out.println("DerivedB ");
    }
}
