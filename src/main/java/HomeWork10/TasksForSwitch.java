package HomeWork10;

import java.util.Scanner;

public class TasksForSwitch {
    public static void main(String[] args) {
//        Вывод дня недели по номеру
//        dayOfWeek();
//        Стоимость билета по дню недели
//        ticketPrice();
//        Перевод числовых оценок в буквенные (A–F)
//        rateToCharacter();
//        Обработка текстовых команд
//        textOperations();
//        Простой калькулятор с использованием switch
//        calculate();

    }

    public static void dayOfWeek() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String nameOfDay;
        switch (a) {
            case 1 -> nameOfDay = "Понедельник";
            case 2 -> nameOfDay = "Вторник";
            case 3 -> nameOfDay = "Среда";
            case 4 -> nameOfDay = "Четверг";
            case 5 -> nameOfDay = "Пятница";
            case 6 -> nameOfDay = "Суббота";
            case 7 -> nameOfDay = "Воскресенье";
            default -> nameOfDay = "Неверный день недели";
        }
        System.out.println(nameOfDay);
    }

    public static void ticketPrice() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String price;

        switch (a) {
            case 1, 2, 3, 4, 5 -> price = "300 рублей";
            case 6, 7 -> price = "450 рублей";
            default -> price = "Неверный день недели";
        }
        System.out.println(price);
    }

    public static void rateToCharacter() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String rate;

        if (a < 0 || a > 100) {
            System.out.println("Неверное значение, введите количество балов от 1 до 100.");
            return;
        }

        switch (a / 10) {
            case 10, 9 -> rate = "A";
            case 8 -> rate = "B";
            case 7 -> rate = "C";
            case 6 -> rate = "D";
            default -> rate = "F";

        }
        System.out.println(rate);
    }

    public static void textOperations() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String result;

        switch (string) {
            case "start" -> result = "System online";
            case "stop" -> result = "System stopped";
            case "restart" -> result = "System reboot";
            case "status" -> result = "System doing cakes";
            default -> result = "unknown command";

        }
        System.out.println(result);
    }

    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        String op = scanner.next();
        double b = scanner.nextDouble();

        if (op.equals("/") && b == 0){
            System.out.println("На ноль делить нельзя");
            return;
        }

        String result;
        switch (op){
            case "+" -> result = String.valueOf(a + b);
            case "-" -> result = String.valueOf(a - b);
            case "/" -> result = String.valueOf(a / b);
            case "*" -> result = String.valueOf(a * b);
            default -> result = "ERROR";
        }
        System.out.println("Результат вычисления: " + result);
    }
}
