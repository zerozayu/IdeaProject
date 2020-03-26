package java1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author zhangyu
 * @date 2020/3/20 - 19:23
 */
public class ExecutorServiceTest {
    public static void main(String[] args) {
        //创建一个可控数量的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            service.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "正在被执行！");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }

    }
}

