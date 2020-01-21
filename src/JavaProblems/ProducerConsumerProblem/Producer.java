package JavaProblems.ProducerConsumerProblem;

import java.util.Queue;
import java.util.Random;
import java.util.Vector;

public class Producer implements Runnable {

    Vector sharedQueue;
    int maxsize;
    public Producer(Vector<Integer> queue, int size) {
        this.sharedQueue = queue;
        this.maxsize = size;
    }

    @Override
    public void run() {
      System.out.println("Producer thread started");
      for (int i = 1; i <= 10; i++)  {
          synchronized (sharedQueue) {
              while (sharedQueue.size() == maxsize) {
                  synchronized (sharedQueue) {
                      System.out.println("Produce Queue is full --->" + Thread.currentThread().getName() + " " + sharedQueue.size());
                      try {
                          sharedQueue.wait();
                      } catch (InterruptedException e) {
                          e.printStackTrace();
                      }
                  }
              }

              System.out.println("producing number -->" + i);
              sharedQueue.add(i);
              sharedQueue.notify();
          }
      }
    }
}
