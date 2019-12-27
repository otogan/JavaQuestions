package q21to40;

import java.util.ArrayList;
import java.util.List;

public class Q33 {
    public static void main(String[] args) {
        List<String> names = new ArrayList();
        names.add("Robb");
        names.add("Robb");
        names.add("Robb");
        names.add("Robb");
        names.add("Robb");

        if (names.remove("Robb")) {
            names.remove("Resul");
        }
        System.out.println(names);

    }
}
