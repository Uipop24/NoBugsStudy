package practice7.FunctionalInterfacesAndLambdas;

import java.util.function.IntPredicate;

public class LambdaEvenNum {
    public static void main(String[] args) {

        IntPredicate isEven = n -> n % 2 == 0;
        boolean result = isEven.test(8);
        System.out.println(result);

    }
}
