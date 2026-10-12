package practice7.StreamAPIBasicOperations;

import java.util.List;
import java.util.stream.Collectors;

public class StringFilter {
    public static void main(String[] args) {
        List<String> list = List.of("one","two","three","eleven","four","ninety nine");

        List<String> result = list.stream()
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
