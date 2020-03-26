package java1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 创建线程的方法四：使用线程池
 * 1.corePoolSize\
 *
 *
 * @author zhangyu
 * @date 2020/3/23 - 0:02
 */
class NumberThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}


public class ThreadPool {
    public static void main(String[] args) {
        //1.提供指定线程数量的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor service1= (ThreadPoolExecutor) service;
//        System.out.println(service.getClass());
        service1.setCorePoolSize(15);
//        service1.setKeepAliveTime();
        //2.执行指定的线程的操作，需要提供实现Runable接口或者Callable接口实现类的对象
        service.execute(new NumberThread());//适合用于runnable
        //service.submit(Callable callable);//适合用于callable

        //关闭连接池
        service.shutdown();
    }
}
