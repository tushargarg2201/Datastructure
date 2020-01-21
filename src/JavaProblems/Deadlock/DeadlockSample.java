package JavaProblems.Deadlock;

public class DeadlockSample {
    public static void main(String[] args) throws InterruptedException {
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();

        DeadlockSyncThreads runnable1 = new DeadlockSyncThreads(o1, o2);
        DeadlockSyncThreads runnable2 = new DeadlockSyncThreads(o2, o3);
        DeadlockSyncThreads runnable3 = new DeadlockSyncThreads(o3, o1);

        Thread t1 = new Thread(runnable1);
        t1. start();
        Thread.sleep(2000);
        t1.join();

        Thread t2 = new Thread(runnable2);
        t2.start();
        Thread.sleep(2000);
        t2.join();

        Thread t3 = new Thread(runnable3);
        t3. start();
        t3.join();

        System.out.println("All the thread released and deadlock over");

    }
}

