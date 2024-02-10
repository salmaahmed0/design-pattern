package creational.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Unsafe Thread ... ");
        Thread task1 = new Thread(() -> {
            UnSafeCounter counter1 = UnSafeCounter.getInstance();
            counter1.increment();
            System.out.println("Counter1 Hash Code : "+ counter1.hashCode());
        });
        Thread task2 = new Thread(() -> {
            UnSafeCounter counter2 = UnSafeCounter.getInstance();
            counter2.increment();
            System.out.println("Counter2 Hash Code : "+ counter2.hashCode());
        });
        task1.start();
        task2.start();

        try {
            task1.join();
            task2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Safe Thread ... ");
        task1 = new Thread(() -> {
            SafeCounter counter1 = SafeCounter.getInstance();
            counter1.increment();
            System.out.println("Counter1 Hash Code : "+ counter1.hashCode());
        });
        task2 = new Thread(() -> {
            SafeCounter counter2 = SafeCounter.getInstance();
            counter2.increment();
            System.out.println("Counter2 Hash Code : "+ counter2.hashCode());
        });
        task1.start();
        task2.start();

        try {
            task1.join();
            task2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
