package multithreading;

public class ThreadState {
    public static void main(String[] args) throws InterruptedException {
        Thread mainThread = Thread.currentThread();

        // NEW state
        Thread t1 = new Thread(() -> {
            System.out.println("Main thread state: " + mainThread.getState());
            System.out.println("Vedant01 state: " + Thread.currentThread().getState());
            System.out.println("Name of thread is: " + Thread.currentThread().getName());
        });
        t1.setName("Vedant-01");

        // RUNNABLE state
        t1.start(); // Time taking operation, isliye mostly next line execute ke chances bht zyda hote h

        try {
            Thread.sleep(1000);
        } catch (Exception e) { }

        System.out.println(t1.getState());
    }
}
