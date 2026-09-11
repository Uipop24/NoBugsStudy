package Homework11.Task7;

public class RoalCoaster implements Attraction{
    @Override
    public void info() {
        System.out.println("Американские горки");
    }

    @Override
    public void maintain() {
        System.out.println("Требуется проверка безопасности");
    }
}
