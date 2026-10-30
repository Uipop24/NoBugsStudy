package practice10;

//Код должен напечатать числа от n до 1, но программа падает с StackOverflowError.

public class DebugTask6 {
    public static void main(String[] args) {
        countdown(5);
    }

    public static void countdown(int n) {
//        System.out.println(n);
//        if(n != 1){
//            countdown(n - 1);
//        }
        if(n <= 0){
            return;
        }
        System.out.println(n);
        countdown(n - 1);

    }
}
