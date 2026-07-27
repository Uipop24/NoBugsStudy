package HomeWork7;

public class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double calculateArea(){
        return Math.PI * radius * radius;
    }

    public double calculateCircumference(){
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(100);
        circle.setRadius(1000);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculateCircumference());
    }
}
