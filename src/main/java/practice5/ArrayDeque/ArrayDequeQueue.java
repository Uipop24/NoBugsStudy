package practice5.ArrayDeque;

import java.util.ArrayDeque;

public class ArrayDequeQueue {
    private static ArrayDeque<String> deque = new ArrayDeque<>();

    public static void main(String[] args) {
        deque.add("конец");
        deque.add("конец1");
        deque.add("конец2");
        deque.push("начало");
        deque.push("начало1");
        deque.push("начало2");

        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque);

    }
}
