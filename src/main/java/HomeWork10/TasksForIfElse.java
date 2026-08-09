package HomeWork10;

import java.util.Scanner;

public class TasksForIfElse {
    public static void main(String[] args) {
//        Определение знака числа
//        checkNumbers();
//        Поиск наибольшего из двух чисел
//        minMax();
//        Вывод оценки по шкале 1–5
//        grade();
//        Проверка на чётность
//        parity();
//        Определение размера скидки по возрасту
//        sale();
//        Оценка результата теста по баллам
        gradeResult();

    }

    public static void checkNumbers() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a > 0) {
            System.out.println("Число положительное");
        } else if (a < 0) {
            System.out.println("Число отрицательное");

        } else {
            System.out.println("Число равно нулю");
        }
    }

    public static void minMax() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("введите второе число: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("Число " + a + " больше чем " + b);
        } else {
            System.out.println("Число " + b + " больше чем " + a);
        }
    }

    public static void grade() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите оценку от 1 до 5: ");
        int a = scanner.nextInt();
        if (a == 1 || a == 2) {
            System.out.println("Неудовлетворительно");
        } else if (a == 3) {
            System.out.println("Удовлетворительно");
        } else if (a == 4) {
            System.out.println("Хорошо");
        } else if (a == 5) {
            System.out.println("Отлично");
        } else {
            System.out.println("Неверная оценка");
        }

    }

    public static void parity() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }
    }

    public static void sale() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a < 18) {
            System.out.println("Скидка 25%");
        } else if (a >= 65) {
            System.out.println("Скидка 30%");
        } else {
            System.out.println("Скидки нет");
        }
    }

    public static void gradeResult(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите полученные баллы: ");
        int a = scanner.nextInt();

        if (a >= 90){
            System.out.println("Отлично");
        } else if (a >= 75 && a <= 89) {
            System.out.println("Хорошо");
        } else if (a >= 60 && a <= 74) {
            System.out.println("Удовлетворительно");
        }else {
            System.out.println("Неудовлетворительно");
        }
    }
}
