package JavaProblems.TestYield;

public class TestYield {
    public static void main(String[] args) throws InterruptedException {

        ProducerThread producerRunnable = new ProducerThread();
        Thread producer = new Thread(producerRunnable);
        producer.setPriority(Thread.MAX_PRIORITY);
        producer.start();

        ConsumerThread consumerRunnable = new ConsumerThread();
        Thread consumer = new Thread(consumerRunnable);
        consumer.setPriority(Thread.MIN_PRIORITY);
        consumer.start();
        //Thread.yield();
    }
}
