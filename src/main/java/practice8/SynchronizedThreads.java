package practice8;

class Counter{
    int counter = 0;
    public synchronized void increment(){
        counter++;
    }
}

class ThreadTask implements Runnable {
    private Counter counter;

    public ThreadTask(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 1000; i++){
            counter.increment();
        }
    }
}

public class SynchronizedThreads {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(new ThreadTask(counter));
        Thread t2 = new Thread(new ThreadTask(counter));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Итого " + counter.counter);
    }
}
