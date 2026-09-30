package practice6.DivideOnZero;

public class DivideOnZero {
    public static Integer divide (int first, int second){
        try {
            return first / second;
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
            return null;
            //не уверен, что так правильно, указывать в return null или если у нас int - возвращать просто 0
        }
    }

    public static void main(String[] args) {
        System.out.println(divide(4,2));
    }
}
