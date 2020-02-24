package preparationKit.q71to90;

public class Q83 {
    private static int i;

    private Q83() {}
}

interface Downloadable {
    public void download();
}

interface Readable extends Downloadable {
    public void readBook();
}

abstract class Book implements Readable {
    public void readBook() {
        System.out.println("Read book");
    }
}

class EBook extends Book {
    public void readBook() {
        System.out.println("Read E-Book");
    }

    public void download() {}
}
