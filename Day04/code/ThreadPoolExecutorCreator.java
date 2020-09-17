package Day04;

import java.util.concurrent.*;

public class ThreadPoolExecutorCreator {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 20, 20, TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(200),
                new ThreadPoolExecutor.AbortPolicy());
        final CountDownLatch countDownLatch = new CountDownLatch(4);
        for (int i = 0; i < 4; i++) {
            final int currentIndex = i + 1;
            System.out.println("提交第" + currentIndex+ "个线程");

            threadPoolExecutor.execute(() -> {
                System.out.println(Thread.currentThread().getName()
                        + ", currentIndex is:"
                        + currentIndex);
                countDownLatch.countDown();
            });
        }
        System.out.println("提交完毕");
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程执行完毕");
    }
}
