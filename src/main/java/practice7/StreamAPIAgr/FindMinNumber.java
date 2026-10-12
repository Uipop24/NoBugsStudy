package practice7.StreamAPIAgr;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindMinNumber {

    public static void main(String[] args) {
        List<Integer> list = List.of(4, 5, 6, 99, 12, 15);

        Optional<Integer> minNum = list.stream()
                .min(Comparator.naturalOrder());
        System.out.println(minNum.orElseThrow());
    }

}
