package practice7.StreamAPIBasicOperations;

import java.util.List;
import java.util.stream.Collectors;

public class NumsFilter {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 5, 7, 10, 20, 31, 39, 40, 50, 112, 900);

        List<Integer> filterNums = list.stream()
                .filter(n -> n % 5 == 0)
                .collect(Collectors.toList());
        System.out.println(filterNums);
    }
}
