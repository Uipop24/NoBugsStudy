package practice5.ArrayDeque;

import java.util.ArrayDeque;

public class ArrayDequeStack {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.push("1");
        deque.push("2");
        deque.push("3");
        deque.push("4");
        deque.push("5");
        while (!deque.isEmpty()) {
            System.out.println(deque.pop());
            System.out.println(deque);
        }
    }
}
