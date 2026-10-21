package multithreading;

public class RaceCondition {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 10000; i++) {
                Counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 10000; i++) {
                Counter.increment();
            }
        });

        // expected outcome: 20000
        t1.start();

        try {
            t1.join();
        } catch (Exception e) {

        }

        t2.start();

        try {
            t2.join();
        } catch (Exception e) {

        }



        System.out.println(Counter.getCount());
    }
}

class Counter {
    static int count = 0;

    static void increment() {
        count ++;
    }

    static public int getCount() {
        return count;
    }
}
