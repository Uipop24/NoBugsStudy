package practice4.Task7;

public class AmusementPark {
    private Attraction attraction;

    public void setAttraction(Attraction serAttraction){
        attraction = serAttraction;
    }

    public void operateAttraction(){
        attraction.info();
        attraction.maintain();
    }

    public static void main(String[] args) {
        AmusementPark amusementPark = new AmusementPark();
        amusementPark.setAttraction(new Carousel());
        amusementPark.operateAttraction();
    }
}
