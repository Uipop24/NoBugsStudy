package HomeWork7;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea(){
        return Math.PI * radius *radius;
    }

    public double calculateCircumference(){
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        circle.setRadius(101);
        System.out.println(circle.calculateArea() + ", " + circle.calculateCircumference());
    }
}
