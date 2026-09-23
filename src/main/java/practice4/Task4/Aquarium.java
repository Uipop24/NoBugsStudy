package practice4.Task4;

public class Aquarium {
    private SeaCreature seaCreature;

    public void addCreature(SeaCreature addSeaCreature){
        seaCreature = addSeaCreature;
    }

    public void showMove(){
        seaCreature.move();
    }

    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        aquarium.addCreature(new Shark());
        aquarium.showMove();
    }
}
