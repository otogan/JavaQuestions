package hackerRank;

import java.util.*;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.poll();
        System.out.println(queue.size());

        List<Integer> list = new ArrayList<>();
        list.add(2);
        System.out.println(list.contains(2));
    }
}
