package practice4.Task8;

public class Museum {
    private Exhibit exhibit;

    public void setExhibit(Exhibit setExhibit){
        exhibit = setExhibit;
    }

    public void showInfoExhibit(){
        exhibit.history();
        exhibit.preserve();
    }

    public static void main(String[] args) {
        Museum museum = new Museum();
        museum.setExhibit(new Sculpture());
        museum.showInfoExhibit();
    }
}
