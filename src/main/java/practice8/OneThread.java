package practice8;

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Привет из потока!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

public class OneThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

    }
}

