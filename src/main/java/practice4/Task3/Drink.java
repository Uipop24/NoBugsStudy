package practice4.Task3;

public class Drink implements Dish{
    private int volume = 5;

    @Override
    public String getDescription() {
        return "Напиток с объемом " + volume;
    }
}
