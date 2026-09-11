package Homework11.Task5;

public class Cow implements FarmAnimal{
    @Override
    public void care() {
        System.out.println("Корова нуждается в выпасе");
    }

    @Override
    public void produce() {
        System.out.println("Корова даёт молоко");
    }
}
