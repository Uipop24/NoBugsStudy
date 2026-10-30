package practice10;

//Код должен удалять элементы списка, но выбрасывает ConcurrentModificationException.

import java.util.*;
public class DebugTask10 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
        List<String> toRemove = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith("A")) {
                toRemove.add(name);
            }
        }
        names.removeAll(toRemove);
    }
}
