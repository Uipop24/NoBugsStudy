package practice5.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetIsThere {
    private static HashSet<Integer> set = new HashSet<>();

    public static void main(String[] args) {
        set.add(1);
        set.add(11);
        set.add(12);
        set.add(13);
        set.add(14);
        set.add(15);
        set.add(16);
        set.add(17);
        set.add(18);
        set.add(19);

        System.out.println(set.contains(16));
        System.out.println(set.contains(22));

    }
}
