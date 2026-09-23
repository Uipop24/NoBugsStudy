package practice5.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetElements {
    private static LinkedHashSet<String> set =  new LinkedHashSet<>();

    public static void main(String[] args) {
        set.add("1");
        set.add("12");
        set.add("13");
        set.add("14");
        set.add("15");

        System.out.println(set);
    }
}
