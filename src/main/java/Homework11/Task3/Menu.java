package Homework11.Task3;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Dish> dishes = new ArrayList<>();

    public void addDish(Dish addDish){
        dishes.add(addDish);
    }

    public void printInfo(){
        for(Dish d : dishes){
            System.out.println(d.getDescription());
        }
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.addDish(new HotDish());
        menu.printInfo();
    }
}
