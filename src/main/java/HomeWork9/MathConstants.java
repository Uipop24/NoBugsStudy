package HomeWork9;

public class MathConstants {
    final double PI = 3.14159;
    final double E = 2.71828;

    static double calculateCircleArea(double r){
        MathConstants mathConstants = new MathConstants();
        return mathConstants.PI * r * r;
    }

    static double calculateCircumference(double r){
        MathConstants mathConstants = new MathConstants();
        return 2 * mathConstants.PI * r;
    }

    public double calculateExponentialGrowth(double initialValue, double rate, double time){
        MathConstants mathConstants = new MathConstants();
        return initialValue * Math.pow(mathConstants.E, (rate * time));
    }

    public static void main(String[] args) {
        System.out.println(calculateCircleArea(10) + " " + calculateCircumference(90));
        System.out.println(calculateCircleArea(15) + " " + calculateCircumference(190));
    }
}
