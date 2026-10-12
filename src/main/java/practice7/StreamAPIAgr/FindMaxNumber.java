package practice7.StreamAPIAgr;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindMaxNumber {
    public static void main(String[] args) {
        List<Integer> list = List.of(4, 5, 6, 99, 12, 15);

        Optional<Integer> maxNum = list.stream()
                .max(Comparator.naturalOrder());
//              на самом деле не понимаю, как будто можно решить по другому, и данный способ - некорректный
        System.out.println(maxNum.orElseThrow());
    }
}
