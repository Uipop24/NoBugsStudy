package practice6.DivideOnZero;

public class DivideOnZero {
    public static double divide (int first, int second){
        try {
            return (double) first / second;
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
            throw e;
        }
    }

    public static void main(String[] args) {
        System.out.println(divide(4,2));
    }
}
