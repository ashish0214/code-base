package threads.producerConsumerproblem;

public class Producer implements Runnable{

    private  SharedBuffer sharedBuffer;

    public Producer(SharedBuffer sharedBuffer) {
        this.sharedBuffer=sharedBuffer;

    }

    @Override
    public void run() {
       for(int i=0;i<10;i++){
             sharedBuffer.produce(i);
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
        }
    }
}
