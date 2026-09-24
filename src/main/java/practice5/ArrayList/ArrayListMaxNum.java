package practice5.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMaxNum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 34, 56, 15, 10));
        int maxNum = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (num > maxNum){
                maxNum = num;
            }
        }
        System.out.println(maxNum);
    }
}
