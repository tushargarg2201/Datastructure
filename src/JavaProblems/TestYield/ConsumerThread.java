package JavaProblems.TestYield;

public class ConsumerThread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Consumer thread started --->" + i);
            Thread.yield();
        }
    }
}
