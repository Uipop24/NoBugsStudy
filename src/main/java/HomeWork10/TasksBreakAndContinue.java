package HomeWork10;

import java.util.Scanner;

public class TasksBreakAndContinue {
    public static void main(String[] args) {
//        Сумма чисел до первого отрицательного (использовать break)
//        nonPositiveNumber();
//        Пропуск чисел, делящихся на 3 (использовать continue)
//        skipNumbers();
//        Вывод только положительных чисел (использовать continue)
//        onlyPositiveNumbers();
//        Ввод строк до команды "stop" (использовать break)
        inputStrings();

    }

    public static void nonPositiveNumber() {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        while (true) {
            num = scanner.nextInt();
            if (num < 0) {
                break;
            }
            sum = sum + num;
            System.out.println(sum);
        }
    }

    public static void skipNumbers() {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void onlyPositiveNumbers(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            int a = scanner.nextInt();
            if (a < 0){
                continue;
            }
            System.out.println(a);
        }
    }

    public static void inputStrings(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            String string = scanner.nextLine();
            if(string.equals("stop")){
                break;
            }
            System.out.println("Команда принята");
        }
    }
}
