package practice5.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetCheckUniq {

    private static void addUniq(LinkedHashSet<Integer> set, int num) {
        if (!set.add(num)) {
            System.out.println(num + " данный элемент есть, добавлен не был");
        }
    }

    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        addUniq(set,1);
        addUniq(set,2);
        addUniq(set,2);

        System.out.println(set);
    }

}
