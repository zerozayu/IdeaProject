package Java;

/**
 * @author zhangyu
 * @date 2020/3/19 - 10:51
 */
public class ThreadTest {

    public static void main(String[] args) {
        //创建Thread类的子类对象
        MyThread t1 = new MyThread();

        //通过此对象调用start（）：启动当前线程、调用当前线程的run（）
        t1.start();

        //如下的操作仍然在main线程中执行的
        for (int i = 0; i < 100; i++) {

            if(i%2==0){
                System.out.println(i+"********");
            }

        }
    }

}

//创建一个继承于Thread类的子类
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}

