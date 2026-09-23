package practice5.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListNum {
    private static ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));

    public static void main(String[] args) {
        list.add(6);
        System.out.println(list);
    }
}
