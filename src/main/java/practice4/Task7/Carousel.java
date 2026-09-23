package practice4.Task7;

public class Carousel implements Attraction{

    @Override
    public void info() {
        System.out.println("Детская карусель");
    }

    @Override
    public void maintain() {
        System.out.println("Требуется техническое обслуживание");
    }
}
