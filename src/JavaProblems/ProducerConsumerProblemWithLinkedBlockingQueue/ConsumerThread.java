package JavaProblems.ProducerConsumerProblemWithLinkedBlockingQueue;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ConsumerThread implements Runnable {
    BlockingQueue<Integer> sharedQueue;
    int maxSize;
    ConsumerThread(BlockingQueue<Integer> sharedQueue, int size) {
        this.sharedQueue = sharedQueue;
        this.maxSize = size;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Consumed Thread is--->" + sharedQueue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
