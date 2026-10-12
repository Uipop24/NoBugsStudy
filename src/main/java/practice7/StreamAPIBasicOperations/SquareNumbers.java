package practice7.StreamAPIBasicOperations;

import java.util.List;
import java.util.stream.Collectors;

public class SquareNumbers {
    public static void main(String[] args) {
        List<Integer> list = List.of(2, 4, 9, 18, 100);

        List<Integer> sqInt = list.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println(sqInt);
    }
}
