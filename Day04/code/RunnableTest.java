package Day04;

public class RunnableTest implements Runnable {
    @Override
    public void run() {
        synchronized (this){
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        RunnableTest runnableTest = new RunnableTest();
        new Thread(runnableTest, "线程1").start();
        new Thread(runnableTest, "线程2").start();
        new Thread(runnableTest, "线程3").start();
        new Thread(runnableTest, "线程4").start();
    }
}
