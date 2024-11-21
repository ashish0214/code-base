package threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Simple simple=new Simple();
        Thread thread=new Thread(simple);
        thread.start();
        thread.setPriority(10);
        thread.sleep(1000);
        Simple1 simple1=new Simple1();
        Thread thread1=new Thread(simple1);
        thread1.start();
        thread1.setPriority(5);


    }
}
