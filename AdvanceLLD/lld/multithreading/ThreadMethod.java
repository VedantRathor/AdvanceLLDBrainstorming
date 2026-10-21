package multithreading;

public class ThreadMethod {
    public static void main(String[] args) {
//        System.out.println("Main Thread Starts");
//
//        try {
//            Thread.sleep(2000); // Does not release the locks
//        } catch (Exception e) { }
//
//        System.out.println("Main Thread Ends");



        // .join()
//        System.out.println("main thread starts");
//
//        Thread t1 = new Thread(() -> {
//            System.out.println("Thread-0 starts");
//        });
//
//        t1.start(); // costly operation. It takes time
//        t1.join(); // Ye main thread pe lagi hai, so i am saying main thread ki jab tak t1 terminate nahi hojati.. tum wait state me chale jao
//
//        System.out.println("main ends");


        // .yield() -> it is willing to give it's cpu time to other thread who has SAME priority to get executed
//        Thread t1 = new Thread(() -> {
//            Thread.yield(); // t2 is saying here - i am okay to give my cpu time to t2 basically (run hona chahti hai + SAME priority)
//            for (int i = 1; i <= 10; i++) {
//                System.out.println("T1: " + i);
//            }
//        });
//
//        Thread t2 = new Thread(() -> {
//            for (int i = 1; i <= 10; i++) {
//                System.out.println("T2: " + i);
//            }
//        });
//
//        t1.start();
//        t2.start();

        // .interrupt()
//        Thread mainThread = Thread.currentThread();
//        Thread t1 = new Thread(() -> {
//            System.out.println("Thread Name: " + Thread.currentThread().getName());
//            System.out.println("Main state: " + mainThread.getState());
//            try { mainThread.interrupt(); } catch (Exception e) {
//                System.out.println(e);
//            }
//            while (!Thread.currentThread().isInterrupted()) {
//                System.out.println("Hello");
//            }
//        });
//
//        t1.start(); // this operation takes some time
//
//        try {
//            System.out.println("Main going to timed waiting for 20ms");
//            Thread.sleep(20); // TIMED_WAITING and do not release lock
//            t1.interrupt();
//        } catch (Exception e) {
//            System.out.println(e);
//        }

        // isAlive()
//        Thread t1 = new Thread(() -> {
//            try {
//                Thread.sleep(2000);
//            } catch (Exception e) { }
//        });
//
//        System.out.println(t1.isAlive()); // false
//        t1.start();
//        System.out.println(t1.isAlive()); // true
//
//        try {
//            Thread.sleep(3000);
//        } catch (Exception e) { }
//
//        System.out.println(t1.isAlive()); // TERMINATED - false
    }
}
