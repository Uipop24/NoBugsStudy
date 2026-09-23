package practice5.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSumOfNumbers {
    private static ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3,4,5));

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0;i < list.size();i++){
            int num = list.get(i);
            sum += num;
        }
        System.out.println(sum);
    }
}
