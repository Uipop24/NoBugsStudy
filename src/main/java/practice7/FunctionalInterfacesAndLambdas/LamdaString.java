package practice7.FunctionalInterfacesAndLambdas;

import java.util.function.Function;

public class LamdaString {
    public static void main(String[] args) {
        Function<String, Integer> stringLength = s -> s.length();

        System.out.println(stringLength.apply("no_bugs"));

    }
}
