package practice5.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMaxNum {
    private static ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 34, 56, 15, 10));

    public static void main(String[] args) {
        int maxNum = 0;
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (num > maxNum){
                maxNum = num;
            }
        }
        System.out.println(maxNum);
    }
}
