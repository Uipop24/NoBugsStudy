package HomeWork10;

import java.util.Scanner;

public class TaskFor {
    public static void main(String[] args) {
//        Вывод чисел от 1 до 100, делящихся на 3
//        numberDivideOnThree();
//        Сумма чисел от 1 до n
//        sunOfNum();
//        Таблица умножения для числа
//        multiply();
//        Проверка на простое число
        isSimple();
//        Вывод чисел от 1 до 10
//        print();
    }

    public static void numberDivideOnThree() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void sunOfNum() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= a; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void multiply(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(a + " x " + i + " = " + a * i);
        }
    }

    public static void isSimple(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        boolean isPrime = true;
        if(a < 2){
            isPrime = false;
        }else {
            for(int i = 2; i <= a - 1; i++){
                if(a % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(isPrime);
    }

    public static void print(){
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
    }

}
