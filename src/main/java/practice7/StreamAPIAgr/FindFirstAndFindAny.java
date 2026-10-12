package practice7.StreamAPIAgr;

import java.util.List;

public class FindFirstAndFindAny {
    public static void main(String[] args) {
        List<String> list = List.of("Колонка", "Стол","Бутылка","БаблТи","Солома");

        String findFirst = list.stream()
                .filter(s -> s.startsWith("Б"))
                .findFirst()
                .get();

        System.out.println(findFirst);

        String findAny = list.stream()
                .filter(s -> s.startsWith("С"))
                .findAny()
                .get();

        System.out.println(findAny);
    }
}
