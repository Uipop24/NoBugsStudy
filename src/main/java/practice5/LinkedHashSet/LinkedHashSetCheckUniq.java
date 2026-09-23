package practice5.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetCheckUniq {

    private static LinkedHashSet<Integer> set = new LinkedHashSet<>();

    public static void addUniq(int num) {
        if (!set.contains(num)) {
            set.add(num);
        } else {
            System.out.println(num + " данный элемент есть, добавлен не был");
        }
    }

    public static void main(String[] args) {
        addUniq(1);
        addUniq(2);
        addUniq(2);

        System.out.println(set);
    }

}
