package threads;

public class Simple1 implements Runnable{
    @Override
    public void run() {
        for(int i=100;i<110;i++){
            System.out.println(i);
        }
    }
}
