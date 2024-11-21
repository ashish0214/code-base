package threads.producerConsumerproblem;

public class ProducerConsumerProblem{
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer(5);
        Thread producerThread = new Thread(new Producer(buffer));
        Thread consumerThread = new Thread(new Consumer(buffer));

        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
