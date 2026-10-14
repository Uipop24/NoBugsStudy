package practice8;

class TwoMyThread extends Thread {
    String string;

    public TwoMyThread(String string) {
        this.string = string;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(string);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class TwoThreads {
    public static void main(String[] args) {
        TwoMyThread firstThread = new TwoMyThread("A");
        TwoMyThread secondThread = new TwoMyThread("B");
        firstThread.start();
        secondThread.start();


    }
}
