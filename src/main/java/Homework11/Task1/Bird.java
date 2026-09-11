package Homework11.Task1;

public class Bird extends Animal{
    @Override
    void sound(){
        System.out.println("Птица чирикает");
    }

    @Override
    void move(){
        System.out.println("Птица летает");
    }
}
