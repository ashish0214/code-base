package Pattern.singleton;

public class ThreadSafeSingleTone {
    private static ThreadSafeSingleTone threadSafeSingleTone;

    private ThreadSafeSingleTone(){}

    public static ThreadSafeSingleTone getInstance(){
        if(threadSafeSingleTone==null){

//            now it is thread safe as
            synchronized(ThreadSafeSingleTone.class){
                if(threadSafeSingleTone==null){
                    threadSafeSingleTone=new ThreadSafeSingleTone();
                }
            }
        }
        return threadSafeSingleTone;
    }
}
