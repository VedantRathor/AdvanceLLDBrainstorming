package multithreading;

public class Rough {
    public static void main(String[] args) {
        System.out.println("working..");
        X x = new X();
        x.val = 20;
        Runnable r = x;

        Thread t1 = new Thread(x);
        t1.start();

        Dummy obj = new Dummy();
        m1(obj);

        Test parent = obj;
        m1(parent);
    }

    static void m1(Test obj) {
        obj.test();
    }
}

class X implements Runnable {
    int val = 10;
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

class Dummy implements Test {
    @Override
    public void test() {
        System.out.println("overrided test");
    }
}

interface Test {
    void test();
}
