package practice5.PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueNum {
    private static PriorityQueue<Integer> queue = new PriorityQueue<>();

    public static void main(String[] args) {
        queue.add(2);
        queue.add(1);
        queue.add(5);
        queue.add(4);
        queue.add(3);

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
            System.out.println(queue);
        }

    }

}
