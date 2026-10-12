package practice7.StreamAPIGroup;

import java.util.List;
import java.util.stream.Collectors;

public class MeanValueOfNums {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        double meanNum = integerList.stream()
                .collect(Collectors.averagingDouble(n -> n));

//        double meanNum2 = integerList.stream()
//                .mapToInt(n -> n)
//                .average()
//                .orElseThrow();
//        нет уверенности, какой из вариантов действительно правильный

        System.out.println(meanNum);
//        System.out.println(meanNum2);
    }
}
