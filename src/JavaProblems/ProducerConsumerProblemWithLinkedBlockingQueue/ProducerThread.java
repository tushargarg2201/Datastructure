package JavaProblems.ProducerConsumerProblemWithLinkedBlockingQueue;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerThread implements Runnable {

    BlockingQueue<Integer> sharedQueue;
    int maxSize;
    ProducerThread(BlockingQueue<Integer> sharedQueue, int size) {
        this.sharedQueue = sharedQueue;
        this.maxSize = size;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Produced thread is--->" + i);
            try {
                sharedQueue.put(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
