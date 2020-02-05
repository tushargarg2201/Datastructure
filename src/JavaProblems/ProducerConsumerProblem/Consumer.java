package JavaProblems.ProducerConsumerProblem;

import java.util.Queue;
import java.util.Vector;

public class Consumer implements Runnable {

    Vector<Integer> sharedQueue;
    int maxSize;
    public Consumer(Vector<Integer> queue, int size) {
        this.sharedQueue = queue;
        this.maxSize = size;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (sharedQueue) {
                while (sharedQueue.isEmpty()) {
                    System.out.println("Queue is empty " + Thread.currentThread().getName()
                                + " is waiting , size: " + sharedQueue.size());
                    try {
                        sharedQueue.wait();
                    } catch (InterruptedException e) {
                            e.printStackTrace();
                    }
                }
                int number = (Integer) sharedQueue.remove(0);
                System.out.println("comsumed element is--->" + number);
                sharedQueue.notify();
            }
        }
    }
}
