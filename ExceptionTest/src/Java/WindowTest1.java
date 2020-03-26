package Java;

import sun.plugin2.message.GetNameSpaceMessage;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author zhangyu
 * @date 2020/3/19 - 15:42
 *
 * synchronizedh
 */
public class WindowTest1 {
    public static void main(String[] args) {
        Window1 w = new Window1();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();
    }
}

class Window1 implements Runnable{

    int ticket =100;
    //Object obj= new Object();

    @Override
    public void run() {
        while(true){
            synchronized(this) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "：卖票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}