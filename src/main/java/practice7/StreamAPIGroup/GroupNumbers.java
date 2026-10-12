package practice7.StreamAPIGroup;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupNumbers {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

        Map<Boolean, List<Integer>> groupNums = list.stream()
                .collect(Collectors.groupingBy(n -> n%2==0));

        System.out.println(groupNums);
    }
}
