package preparationKit.q41to50;

public class Q47 {
    public static void main(String[] args) {
        Book book1 = new EBook();
        book1.readBook();
    }
}

interface Readable {
    void readBook();
    void setBookMark();
}

abstract class Book implements Readable {
    public void readBook() { }
//    public void setBookMark() { }
}

class EBook extends Book {
    public void readBook() { }
    public void setBookMark() {}
}
