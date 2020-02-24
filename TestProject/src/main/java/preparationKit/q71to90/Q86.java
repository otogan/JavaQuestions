package preparationKit.q71to90;

public class Q86 {
}

interface Readable2 {
    public void readBook();
    public void setBookMark();
}

abstract class Book2 implements Readable2 {
    public void readBook() { }
}

abstract class EBook2 extends Book2 {
    public void readBook() { }
    public void setBookMark() {}
}