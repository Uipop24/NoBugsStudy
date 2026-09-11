package Homework11.Task5;

public class Chiсken implements FarmAnimal{
    @Override
    public void care() {
        System.out.println("Курица требует зерно");
    }

    @Override
    public void produce() {
        System.out.println("Курица несёт яйца");
    }
}
