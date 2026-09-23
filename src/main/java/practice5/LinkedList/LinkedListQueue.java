package practice5.LinkedList;

import java.util.LinkedList;

public class LinkedListQueue {
    private static LinkedList<String> list = new LinkedList<>();

    public static void main(String[] args) {
        list.add("Первая задача");
        list.add("Вторая задача");
        list.add("Третья задача");
        while(!list.isEmpty())
        System.out.println(list.poll());
        System.out.println(list);
    }
}
