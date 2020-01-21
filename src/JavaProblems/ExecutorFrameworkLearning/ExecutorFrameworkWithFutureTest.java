package JavaProblems.ExecutorFrameworkLearning;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ExecutorFrameworkWithFutureTest {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(4);
        List<Future> list = new ArrayList<Future>();
        Lock lock = new ReentrantLock(true);
        for(int i = 1; i <= 100; i++) {
            Future<Integer> future = service.submit(new WorkerThread(i));
            list.add(future);
        }
        List<Runnable> pendingCallable = service.shutdownNow();

        for (int i = 0; i < list.size(); i++) {
            Future future = list.get(i);
            try {
                Integer result = (Integer) future.get();
                System.out.println("result is---->" + result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }

    static class WorkerThread implements Callable<Integer> {
        int data;
        WorkerThread(int i) {
            data = i;
        }
        @Override
        public Integer call() throws Exception {
            Thread.sleep(1000);
            return data;
        }
    }
}