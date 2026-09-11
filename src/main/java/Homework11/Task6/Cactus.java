package Homework11.Task6;

public class Cactus implements Plant{
    @Override
    public void water() {
        System.out.println("Кактус — редкий полив");
    }

    @Override
    public void sun() {
        System.out.println("Кактус — много света");
    }
}
