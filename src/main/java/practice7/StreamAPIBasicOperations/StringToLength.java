package practice7.StreamAPIBasicOperations;

import java.util.List;
import java.util.stream.Collectors;

public class StringToLength {
    public static void main(String[] args) {
        List<String> list = List.of("Maksim","Marina","Ruslan","Ivan");

        List<Integer> length = list.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());

        System.out.println(length);

    }
}
