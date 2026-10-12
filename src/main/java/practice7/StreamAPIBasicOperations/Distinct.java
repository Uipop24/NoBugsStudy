package practice7.StreamAPIBasicOperations;

import java.util.List;
import java.util.stream.Collectors;

public class Distinct {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 3, 45, 1, 2, 100, 97, 100);

        List<Integer> uniqNums = list.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniqNums);
    }
}
