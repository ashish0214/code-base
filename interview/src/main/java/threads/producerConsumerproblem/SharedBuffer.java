package threads.producerConsumerproblem;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class SharedBuffer {
    public final BlockingQueue<Integer> sharedBuffer;
    SharedBuffer(Integer size){
        sharedBuffer = new ArrayBlockingQueue<>(size);
    }
    void produce(Integer item){
        try {
            sharedBuffer.put(item);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    Integer consume(){
        try {
            return sharedBuffer.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return -1;
    }

}
