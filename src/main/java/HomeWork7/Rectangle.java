package HomeWork7;

public class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int calculateArea(){
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10, 2);
        rectangle1.setWidth(1000);
        System.out.println(rectangle1.calculateArea());
    }
}
