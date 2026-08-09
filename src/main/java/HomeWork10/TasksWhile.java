package HomeWork10;

import java.util.Scanner;

public class TasksWhile {
    public static void main(String[] args) {
//        Вычисление факториала с помощью while
//        factorial();
//        Вывод всех чётных чисел до заданного
//        printEvenNumbers();
//        Обратный отсчёт от введённого числа до 1
        finalCountdown();



    }

    public static void factorial(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 1;
        int i = 1;
        while (i <= n){
            result = result*i;
            i++;
        }
        System.out.println(result);

    }

    public static void printEvenNumbers(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int i = 1;
        while (i <= a){
            if (i % 2 == 0){
                System.out.println(i);

            }
            i++;
        }
    }

    public static void finalCountdown(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        while (a != 0){
            System.out.println(a);
            a--;
        }
    }
}
