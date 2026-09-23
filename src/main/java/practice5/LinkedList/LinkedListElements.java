package practice5.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListElements {
    private static LinkedList<String> list = new LinkedList<>(List.of("one","two","three","four","five"));

    public static void main(String[] args) {
        System.out.println(list);
    }
}
