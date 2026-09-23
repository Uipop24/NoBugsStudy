package practice4.Task6;

public class Orchid implements Plant{

    @Override
    public void water() {
        System.out.println("Орхидея — высокая влажность");
    }

    @Override
    public void sun() {
        System.out.println("Орхидея — тень");
    }
}
