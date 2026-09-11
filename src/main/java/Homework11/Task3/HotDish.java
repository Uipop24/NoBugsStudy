package Homework11.Task3;

public class HotDish implements Dish{

    private int temp = 90;
    @Override
    public String getDescription() {
        return "Горячее блюдо с температурой " + temp;
    }
}
