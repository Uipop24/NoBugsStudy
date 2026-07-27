package HomeWork7;

public class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double applyDiscout(double discount){
        price = price - (price * discount / 100);
        return price;
    }

    public void printInfo(){
        System.out.println(name + "," + price);
    }

    public static void main(String[] args) {
        Product product = new Product("Apple", 100);
        product.setPrice(220);
        product.applyDiscout(8);
        product.printInfo();

    }
}
