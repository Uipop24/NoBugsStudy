package HomeWork7;

public class Product {
    String name;
    double price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double applyDiscount(double discount){
        price = price - (price * discount / 100);
        return price;
    }

    public void printInfo(){
        System.out.println(name + " " + price);
    }

    public static void main(String[] args) {
        Product product = new Product("Хлеб", 200);
        product.setPrice(400);
        product.applyDiscount(10);
        product.printInfo();
    }
}
