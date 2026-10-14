package practice8;


class VolThread extends Thread {
    private volatile boolean stop = false;

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    @Override
    public void run() {
        int counter = 0;
        while (!stop) {
            counter++;
            System.out.println("Работаем " + counter);

        }
    }
}

public class ThreadWithVolatile {
    public static void main(String[] args) {
        VolThread volThread = new VolThread();
        volThread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        volThread.setStop(true);
        System.out.println("Остановка работ");
    }
}
