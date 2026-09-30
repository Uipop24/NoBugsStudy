package practice6.Jenericks;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static <T> void printArray(T[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        printArray(new Integer[]{1, 2});
        printArray(new String[]{"3", "4"});

    }
}

