package practice5.TreeMap;

import java.util.TreeMap;

public class TreeMapSort {
    private static TreeMap<String, Integer> map = new TreeMap<>();

    public static void addElements(String name, int point){
        map.put(name, point);
    }

    public static void main(String[] args) {
        addElements("Victor", 90);
        addElements("Tolik", 30);
        addElements("Ruslan", 98);
        addElements("Maksim", 0);
        addElements("Marina", 91);

        System.out.println(map);
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
    }


}
