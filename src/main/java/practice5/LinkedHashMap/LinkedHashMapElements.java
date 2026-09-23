package practice5.LinkedHashMap;

import java.util.LinkedHashMap;

public class LinkedHashMapElements {
    private static LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

    public static void main(String[] args) {
        map.put("A",1);
        map.put("C",3);
        map.put("B",2);
        map.put("D",5);
        map.put("E",4);

        System.out.println(map);

    }
}
