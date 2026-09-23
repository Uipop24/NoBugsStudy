package practice5.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLenght {
    private static ArrayList<String> list = new ArrayList<>(List.of("one", "two", "three", "four", "five"));

    public static void main(String[] args) {
        String maxString = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if(s.length() > maxString.length()){
                maxString = s;
            }
        }
        System.out.println(maxString);
    }
}
