package practice5.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEven {
    private static ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));

    public static void main(String[] args) {
        for(int i = 0;i < list.size();i++){
            if(list.get(i) % 2 == 0){
                System.out.println(list.get(i));
            }
        }
    }
}
