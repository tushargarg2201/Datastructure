package JavaProblems.TestYield;

public class ProducerThread implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Producer thread started --->" + i);
            Thread.yield();
        }
    }
}
