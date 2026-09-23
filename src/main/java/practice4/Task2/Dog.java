package practice4.Task2;

public class Dog extends Pet{
    @Override
    void care() {
        System.out.println("Собака гуляет");
    }

    @Override
    void feed() {
        System.out.println("Собака ест сухой корм");
    }
}
