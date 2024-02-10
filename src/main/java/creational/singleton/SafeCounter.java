package creational.singleton;

public class SafeCounter {
    public int count  = 0 ;
    private static volatile SafeCounter instance;
    private SafeCounter(){}

    public static SafeCounter getInstance(){
        // double-checked locking
        if(instance == null) {
            synchronized (SafeCounter.class) {
                if (instance == null) {
                    instance = new SafeCounter();
                }
            }
        }
        return instance;
    }
    public void increment(){
        count++;
    }
}
