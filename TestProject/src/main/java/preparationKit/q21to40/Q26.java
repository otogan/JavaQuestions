package preparationKit.q21to40;

public class Q26 {
    public static int count = 0;
    int i = 0;

    public void changeCount() {
        while (i < 5) {
            i++;
            count++;
        }
    }

}

class Test {
    static int count = 0;
    int i = 0;

    public void changeCount() {
        while (i < 5) {
            i++;
            count++;
        }
    }

    public static void main(String[] args) {
        Test2 check1 = new Test2();
        Test2 check2 = new Test2();
//        check1.changeCount();
//        check2.changeCount();
//        System.out.println(check1.count + " : " + check2.count);
    }
}
