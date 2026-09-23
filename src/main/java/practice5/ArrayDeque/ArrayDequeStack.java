package practice5.ArrayDeque;

import java.util.ArrayDeque;

public class ArrayDequeStack {
    private static ArrayDeque<String> deque = new ArrayDeque<>();

    public static void main(String[] args) {
        deque.push("1");
        deque.push("2");
        deque.push("3");
        deque.push("4");
        deque.push("5");

        System.out.println(deque);
    }
}
