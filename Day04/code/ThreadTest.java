package Day04;

public class ThreadTest extends Thread{
    @Override
    public void run() {
                synchronized (this) {
                System.out.println(Thread.currentThread().getName());
                }
    }

    public static void main(String[] args) {
        ThreadTest t1 = new ThreadTest();
        ThreadTest t2 = new ThreadTest();
        ThreadTest t3 = new ThreadTest();
        ThreadTest t4 = new ThreadTest();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
