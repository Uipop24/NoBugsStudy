package practice10;

//Код должен сравнить два числа, но почему-то результат не соответствует ожиданиям.

public class DebugTask8 {
    public static void main(String[] args) {
        double a = 0.1 * 3;
        double b = 0.3;
        if (Math.round(a) == Math.round(b)) { //можно так же поменять переменные на BigDecimal но как бужто округления должно хватить
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
