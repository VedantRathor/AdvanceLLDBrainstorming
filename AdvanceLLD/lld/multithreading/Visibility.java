package multithreading;

// stale read issue from cache
public class Visibility {
    volatile static boolean flag = false;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
           try {
               Thread.sleep(1000);
           } catch (Exception e) {

           }

           flag = true;
        });

        Thread t2 = new Thread(() -> {
            // this t2 thread will read flag val from cache instead of RAM
            while (!flag) {

            }
        });

        t1.start();
        t2.start();
    }
}
