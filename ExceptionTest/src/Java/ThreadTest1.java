package Java;

/**
 * @author zhangyu
 * @date 2020/3/19 - 14:57
 */
class MThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}

public class ThreadTest1{
    public static void main(String[] args) {
        MyThread m1 = new MyThread();
        Thread t1 = new Thread(m1);
        t1.start();
    }
}
