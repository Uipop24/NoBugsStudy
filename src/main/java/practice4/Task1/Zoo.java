package practice4.Task1;

public class Zoo {
    private Animal animal;

    public void addAnimal(Animal a){
        animal = a;
    }

    public void printAnimalInfo(){
        animal.move();
        animal.sound();

    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Elephant());
        zoo.printAnimalInfo();
        zoo.addAnimal(new Bird());
        zoo.printAnimalInfo();
    }
}
