package JavaProblems.ExecutorFrameworkLearning;

import javafx.concurrent.Worker;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFrameworkTest {
    public static void main(String[] args) {
        int count = Runtime.getRuntime().availableProcessors();
        System.out.println("available processor count--->" + count);
        ExecutorService service = Executors.newFixedThreadPool(4);
        for (int i = 1; i <= 20; i++) {
            service.execute(new Worker(i));
        }
        service.shutdown();
    }

    static class Worker implements Runnable {
        int taskPerformed;

        Worker(int i) {
            taskPerformed = i;
        }
        @Override
        public void run() {
            try {
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName() + " task performed --->" + taskPerformed);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
