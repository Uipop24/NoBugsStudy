package Homework11.Task2;

public class Cat extends Pet{
    @Override
    void care() {
        System.out.println("Кошка играет");
    }

    @Override
    void feed() {
        System.out.println("Кошка ест сухой корм");
    }
}
