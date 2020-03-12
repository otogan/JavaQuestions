package myQuestions.lists;


import org.junit.Test;

import java.util.*;

public class Lists {
    public static void main(String[] args) {

    }

    @Test
    public static void iterations1() {
//        String[] names = new String[] {"Ryan", "Hacce", "Fato"};
        List<String> nms = Arrays.asList("Ryan", "Hacce", "Fato");

        for(String r : nms) {
            System.out.println(r);
        }

        for (int i = 0; i < nms.size(); i++) {
            System.out.println(nms.get(i));
        }

        List<Integer> ints = Arrays.asList(2, 4, 6, 8, 9);
        ints.forEach(i -> System.out.println(i));

        Integer[] nums = new Integer[]{1, 2, 4, 7, 9};
        List<Integer> numList = Arrays.asList(nums);

        for(int j: numList) {
            System.out.println(j);
        }
    }

    @Test
    public static void iterations2() {
        LinkedList<String> animals = new LinkedList<>(Arrays.asList("monkey", "cat", "dog"));
        Iterator<String> it = animals.iterator();
        while(it.hasNext()) {
            String value = it.next();
            if (value.equals("cat")) {
                it.remove();
            } //else {
                System.out.println(value);
//            }
        }
        System.out.println(animals);
    }

    @Test
    public void sortArray() {
        int[] array = {5, 2, 7, 9, 3, 6, 2, 4, 2, 3};
//        int temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }
        map.forEach((k, v) -> System.out.println(k + " repeats " + v + " times."));

        System.out.println("=== Next Method ===");

        int current = array[0];
        int times = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != current) {
                System.out.println(current + " repeats " + times + " times.");
                current = array[i];
                times = 1;
            } else {
                times++;
            }
        }
        System.out.println(current + " repeats " + times + " times.");
    }
}
