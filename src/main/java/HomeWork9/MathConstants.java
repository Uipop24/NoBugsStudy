package HomeWork9;

public class MathConstants {
    final double PI = 3.14159;
    final double E = 2.71828;

    static double calculateCircleArea(double r){
        MathConstants mathConstants_area = new MathConstants();
        return mathConstants_area.PI * r * r;
    }

    static double calculateCircumference(double r) {
        MathConstants mathConstants_Circumference = new MathConstants();
        return 2 * mathConstants_Circumference.PI * r;
    }

    public double calculateExponentialGrowth(double initialValue, double rate, double time){
        MathConstants mathConstants_growth = new MathConstants();
        double result = initialValue * Math.pow(mathConstants_growth.E, (rate * time));
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculateCircumference(2) + " " + calculateCircleArea(3));
        System.out.println(calculateCircumference(55) + " " + calculateCircleArea(75));
    }
}
