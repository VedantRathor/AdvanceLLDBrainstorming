package multithreading;

public class NonDeterministicBehavior {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        Thread t1 = new Thread(() -> {
           for (int i = 1; i <= 100; i++) {
               if (i % 2 == 0) {
                   System.out.println(Thread.currentThread().getName() + ": " + i);
               }
           }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 100; i++) {
                if (i % 2 != 0) {
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                }
            }
        });

        // We don't know whether this is true LLrlism or Concurrent Behaviour (context switching)
        t1.start();
        t2.start();
    }
}
