package Homework11.Task2;

public class Master {

    private Pet pet;

    public void setPet(Pet setPet){
        pet = setPet;
    }

    public void handlePet(){
        pet.care();
        pet.feed();
    }

    public static void main(String[] args) {
        Master master = new Master();
        master.setPet(new Cat());
        master.handlePet();

    }
}
