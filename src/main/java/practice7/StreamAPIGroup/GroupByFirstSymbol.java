package practice7.StreamAPIGroup;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByFirstSymbol {
    public static void main(String[] args) {
        List<String> list = List.of("Алабама","Бритни","Виктор","Алабуга","Витек","Борис");

        Map<Character, List<String>> groupList = list.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));

        System.out.println(groupList);

    }

}
