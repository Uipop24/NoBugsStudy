package practice7.FunctionalInterfacesAndLambdas;

public class Main {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        MathOperation supply = (a,b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation divide = (a, b) -> a / b;

        System.out.println(supply.operate(11,10));
        System.out.println(add.operate(10,10));
        System.out.println(multiplication.operate(11,10));
        System.out.println(divide.operate(20,10));


        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };
        r1.run();

    }
}
