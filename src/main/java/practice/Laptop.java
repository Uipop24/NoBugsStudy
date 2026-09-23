package practice;

public class Laptop {
    String brand;
    int price;

    public Laptop(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void printInfo(){
        System.out.println(brand + ", " + price + " rub");
    }

    public static void main(String[] args) {
        Laptop laptop = new Laptop("LG", 1200);
        laptop.setPrice(1600);
        laptop.printInfo();
    }
}
