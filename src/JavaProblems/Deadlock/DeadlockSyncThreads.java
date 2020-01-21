package JavaProblems.Deadlock;

public class DeadlockSyncThreads implements Runnable {
    Object o1;
    Object o2;

    DeadlockSyncThreads(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " acquiring lock on --->" + o1);

        synchronized (o1) {
            System.out.println(name + " acquired lock on ---->" + o1);
            dowork();
            System.out.println(name + " release lock on ---->" + o1);
        }
        synchronized (o2) {
            System.out.println(name +" acquired lock on ---->" + o2);
            dowork();
            System.out.println(name + " released lock on ---->" + o2);
        }
    }

    private void dowork() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
