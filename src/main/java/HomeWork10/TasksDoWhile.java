package HomeWork10;

import java.util.Scanner;

public class TasksDoWhile {
    public static void main(String[] args) {
//        Запрос положительного числа
//        positiveNumber();
//        Проверка пароля
//        checkPassword();
//        Вывод чисел от 1 до 10 с использованием do-while
//        numbersFromTo();
//        Завершение программы по команде "exit"
//        endOfProgram();
//        Подсчёт количества цифр в числе
        amountInNumber();




    }

    public static void positiveNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Введите положительное число :");
            number = scanner.nextInt();
        } while (number <= 0);
        System.out.println("Число положительное");

    }

    public static void checkPassword() {
        Scanner scanner = new Scanner(System.in);
        String pass;

        do {
            System.out.println("Введите пароль: ");
            pass = scanner.nextLine();
        } while (!pass.equals("1234567"));
        System.out.println("Пароль верный! Добро пожаловать");
    }

    public static void numbersFromTo() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    public static void endOfProgram(){
        Scanner scanner = new Scanner(System.in);
        String string;
        do {
            System.out.println("Введите команду exit: ");
            string = scanner.nextLine();
        }while (!string.equals("exit"));
        System.out.println("Программа завершена, хорошего дня!");
    }

    public static void amountInNumber(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        if (number == 0){
            System.out.println(1);
            return;
        }
        do {
            number = number / 10;
            count++;
        }while (number != 0);
        System.out.println(count);
    }
}
