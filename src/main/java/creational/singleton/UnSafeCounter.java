package creational.singleton;

public class UnSafeCounter {
    public int count = 0;
    private static UnSafeCounter instance;
    private UnSafeCounter(){}
    public static UnSafeCounter getInstance(){
        if(instance == null) {
            instance = new UnSafeCounter();
        }
        return instance;
    }
    public int increment(){
        return count++;
    }
}
