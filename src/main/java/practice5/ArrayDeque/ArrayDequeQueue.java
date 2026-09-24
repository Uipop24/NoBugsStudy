package practice5.ArrayDeque;

import java.util.ArrayDeque;

public class ArrayDequeQueue {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("конец");
        deque.add("конец1");
        deque.add("конец2");
        deque.addFirst("начало");
        deque.addFirst("начало1");
        deque.addFirst("начало2");

        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque);

    }
}
