package HomeWork10;

import java.util.Scanner;

public class TasksIfElse {
    public static void main(String[] args) {
        // определение знака числа
        // checkPronCons();
        // Поиск наибольшего из двух чисел
        // minMax();
        // Вывод оценки по шкале 1–5
        // grade();
        // Проверка на чётность
        // parity();
        // Определение размера скидки по возрасту
        //sale();
        //Оценка результата теста по баллам
        gradeResult();


    }

    public static void checkPronCons() {
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
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("Число " + a + " больше чем " + b);
        } else {
            System.out.println("Число " + b + " больше чем " + a);
        }
    }

    public static void grade() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите оценку: ");
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
            System.out.println("Оценка неверна");
        }
    }

    public static void parity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для проверки на четность: ");
        int a = scanner.nextInt();

        if (a % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число не четное");
        }
    }

    public static void sale() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст для проверки скидки: ");
        int a = scanner.nextInt();

        if (a <= 18 && a >= 0) {
            System.out.println("Ваша скидка 25%");
        } else if (a >= 65) {
            System.out.println("Ваша скидка 30%");
        } else if (a < 0) {
            System.out.println("Неверный возраст");
        } else {
            System.out.println("Без скидки");
        }
    }

    public static void gradeResult() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите полученные баллы: ");
        int a = scanner.nextInt();

        if (a >= 90){
            System.out.println("Отлично");
        }else if(a >= 75 && a <= 89){
            System.out.println("Хорошо");
        }else if(a >= 60 && a <= 74){
            System.out.println("Удовлетворительно");
        }else {
            System.out.println("Неудовлетворительно");
        }

    }
}
