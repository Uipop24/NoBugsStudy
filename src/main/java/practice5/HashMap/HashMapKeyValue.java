package practice5.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapKeyValue {
    private static HashMap<String, Integer> map = new HashMap<>(Map.of("Maksim", 33, "Marina", 34,
            "Ruslan", 33, "Ivan", 28));

    //Реализуйте метод, который печатает из HashMap всех пользователей младше 18 лет.
    public static void findKid() {
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if (pair.getValue() < 18) {
                System.out.println(pair.getKey() + " " + pair.getValue());
            }
        }
    }

    public static void main(String[] args) {
        map.put("Evgenii", 34);
        map.put("Victor", 16);
        map.put("Victor_Second", 29);
        map.put("Victor_Third", 10);
        findKid();

        System.out.println(map);

        //Проверьте, есть ли определённое имя в HashMap.
        System.out.println(map.containsKey("Dmitrii"));
        System.out.println(map.containsKey("Ivan"));
    }
}
