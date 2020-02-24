package preparationKit.q51to70;

public class Q64 {
    void readCard (int cardNo) throws Exception {
        System.out.println("Reading card");
    }

    void checkCard(int cardNo) throws RuntimeException {
        System.out.println("Checking card");
    }

    void checkNoting() {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        Q64 ex = new Q64();
        int cardNo = 12344;
        ex.checkCard(cardNo);
//        ex.readCard(cardNo);
        ex.checkNoting();
    }
}
