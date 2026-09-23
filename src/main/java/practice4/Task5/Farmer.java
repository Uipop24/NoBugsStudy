package practice4.Task5;

public class Farmer {
    private FarmAnimal farmAnimal;

    public void setFarmAnimal(FarmAnimal setFarmAnimal){
        farmAnimal = setFarmAnimal;
    }

    public void manageFarmAnimal(){
        farmAnimal.care();
        farmAnimal.produce();
    }

    public static void main(String[] args) {
        Farmer farmer = new Farmer();
        farmer.setFarmAnimal(new Chiсken());
        farmer.manageFarmAnimal();
    }
}
