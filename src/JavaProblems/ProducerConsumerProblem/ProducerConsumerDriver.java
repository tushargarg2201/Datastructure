package JavaProblems.ProducerConsumerProblem;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Vector;

public class ProducerConsumerDriver {
    public static void main(String[] args) {
        int maxSize = 5;
        Vector<Integer> shareQueue = new Vector<>(maxSize);
        Producer p = new Producer(shareQueue, maxSize);
        Thread producerThread = new Thread(p);
        Consumer consumer = new Consumer(shareQueue, maxSize);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();

    }
}
