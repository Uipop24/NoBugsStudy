package Homework11.Task6;

public class BotanicalGarden {
    private Plant plant;

    public void addPlant(Plant addPlant){
        plant = addPlant;
    }

    public void careAboutPlant(){
        plant.sun();
        plant.water();
    }

    public static void main(String[] args) {
        BotanicalGarden botanicalGarden = new BotanicalGarden();
        botanicalGarden.addPlant(new Orchid());
        botanicalGarden.careAboutPlant();
    }
}
