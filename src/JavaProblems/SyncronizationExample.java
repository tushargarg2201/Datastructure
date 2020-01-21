package JavaProblems;

public class SyncronizationExample {
    static volatile int  count = 0;
    private static Object mutex = new Object();
    public static void main(String[] args) throws InterruptedException {
        Sample1Sync runnable1 = new Sample1Sync();
        Thread t1 = new Thread(runnable1);
        t1.start();
        t1.join();

        Sample2Sync runnable2 = new Sample2Sync();
        Thread t2 = new Thread(runnable2);
        t2.start();
        t2.join();

        System.out.println("Value of count is--->" + count);
    }
    static class Sample1Sync implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(i * 100);
                    synchronized (mutex) {
                        count++;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Sample1Sync thread1 started--->" + count);

            }
        }
    }

   static class Sample2Sync implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(i * 100);
                    synchronized (mutex) {
                        count++;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Sample1Sync thread2 started--->" + count);
            }
        }
    }
}
