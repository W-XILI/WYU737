package Day04;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableTest implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        synchronized (this){
            System.out.println(Thread.currentThread().getName());
        }
        return null;
    }

    public static void main(String[] args) {
        CallableTest callableTest = new CallableTest();
        FutureTask futureTask1 = new FutureTask(callableTest);
        FutureTask futureTask2 = new FutureTask(callableTest);
        FutureTask futureTask3 = new FutureTask(callableTest);
        FutureTask futureTask4 = new FutureTask(callableTest);
        Thread thread1 = new Thread(futureTask1);
        Thread thread2 = new Thread(futureTask2);
        Thread thread3 = new Thread(futureTask3);
        Thread thread4 = new Thread(futureTask4);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }

}
