package HomeWork7;

public class Car{
    String brand;
    int year;

    public Car(String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void print(){
        System.out.println("Марка " + brand + ", Год выпуска " + year);
    }
    public static void main(String[] args) {
        Car newCar = new Car("Totoya",1999);
        newCar.setYear(1898);
        newCar.print();
    }
}


