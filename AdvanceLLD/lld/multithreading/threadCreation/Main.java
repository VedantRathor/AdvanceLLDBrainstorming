package multithreading.threadCreation;

public class Main {
    public static void main(String[] args) {
        // Extending Thread class
        // We are not creating thread here
        MyThread t1 = new MyThread();
        t1.start();

        // Implementing Runnable IF
        // Here we are only creating the thread and passing runnable - basically logic which this thread has to perform
        Thread t2 = new Thread(() -> {
            System.out.println("Thread: " + Thread.currentThread().getName());
        });

        t2.start();
    }
}

// Extending Thread class
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread: " + Thread.currentThread().getName());
    }
}
