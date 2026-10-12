package practice7.StreamAPIAgr;

import java.util.List;
import java.util.stream.IntStream;

public class FindSumOfNums {
    public static void main(String[] args) {
        List<Integer> list = List.of(4, 5, 6, 99, 12, 15);

        int sumOfNums = list.stream()
                .mapToInt(n -> n)
                .sum();


        System.out.println(sumOfNums);
    }
}
