package q71to90;

public class Q85 {
    private static int i;
    private Q85() {}
}

abstract class A3 {
    private static int i;
    public void doStuff() {}
    public A3() {}
}

final class A1 {
    public A1() {}
}

class A4 {
    protected static /*final*/ int i;
    private void doStuff() {}
}

/*final*/ abstract class A5 {
    protected static int i;
    void doStuff() {}
    abstract void doIt();
}