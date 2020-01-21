package JavaProblems.ProducerConsumerProblemWithLinkedBlockingQueue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerDriver2 {
    public static void main(String [] args ) {
        int maxSize = 5;
        BlockingQueue<Integer> sharedQueue = new ArrayBlockingQueue<>(maxSize);
        ProducerThread producerRunnable = new ProducerThread(sharedQueue, maxSize);
        ConsumerThread consumerRunnable = new ConsumerThread(sharedQueue, maxSize);

        Thread t1 = new Thread(producerRunnable);
        Thread t2 = new Thread(consumerRunnable);

        t1.start();
        t2.start();
    }

}
