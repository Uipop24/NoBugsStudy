package Homework11.Task8;

public class Sculpture implements Exhibit{
    @Override
    public void history() {
        System.out.println("Древняя история данной скульптуры начинается давно");
    }

    @Override
    public void preserve() {
        System.out.println("Скульптура — нуждается в реставрации");
    }
}
