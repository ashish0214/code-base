package threads.producerConsumerproblem;

public class Consumer implements Runnable{
    private  SharedBuffer sharedBuffer;

    public Consumer(SharedBuffer sharedBuffer) {
        this.sharedBuffer=sharedBuffer;

    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            sharedBuffer.consume();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
