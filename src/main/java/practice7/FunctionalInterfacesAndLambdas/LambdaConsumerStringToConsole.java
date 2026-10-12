package practice7.FunctionalInterfacesAndLambdas;

import java.util.function.Consumer;

public class LambdaConsumerStringToConsole {
    public static void main(String[] args) {
        Consumer<String> stringConsumer = s -> System.out.println(s);
        stringConsumer.accept("NO_BUGS");
    }
}
