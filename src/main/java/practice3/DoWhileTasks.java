package practice3;

import java.util.Scanner;

public class DoWhileTasks {
    public static void main(String[] args) {
//        Запрос положительного числа
//        positiveNum();
//        Проверка пароля
//        passwordCheck();
//        Вывод чисел от 1 до 10 с использованием do-while
//        numbersFromTo();
//        Завершение программы по команде "exit"
//        exitProgram();
//        Подсчёт количества цифр в числе
        amountInNum();


    }

    public static void positiveNum() {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Введите положительно число: ");
            number = scanner.nextInt();
        } while (number <= 0);
        System.out.println("число положительное");
    }

    public static void passwordCheck() {
        Scanner scanner = new Scanner(System.in);
        String pass;

        do {
            System.out.println("Введите пароль");
            pass = scanner.nextLine();
        } while (!pass.equals("NO_BUGS"));
        System.out.println("Пароль верный! Добро пожаловать.");

    }

    public static void numbersFromTo() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    public static void exitProgram() {
        Scanner scanner = new Scanner(System.in);
        String string;
        do {
            System.out.println("Введите команду exit: ");
            string = scanner.nextLine();
        } while (!string.equals("exit"));
        System.out.println("Программа завершена, хорошего дня!");

    }

    public static void amountInNum() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;
        if (num == 0) {
            System.out.println(1);
            return;
        }
        do {
            num = num / 10;
            count++;
        } while (num != 0);
        System.out.println(count);
    }
}
