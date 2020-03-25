package JavaProblems;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MillionLoop {
    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        long sum = 0;
        long t2 = 0;
        //final long t3;

        for (long i = 1; i<= 100000; i++) {
            //System.out.println("loop running");
        }
        t2 = System.currentTimeMillis();
        long t3 = t2 - t1;
        System.out.println("t3 is-->" + t3);
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.execute(new Runnable() {
            @Override
            public void run() {

            }
        });



    }
}
