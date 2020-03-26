package java1;

import java.awt.image.BandedSampleModel;
import java.sql.SQLOutput;

/**
 * @author zhangyu
 * @date 2020/3/19 - 20:11
 *
 * 使用同步机制将单例模式中的懒汉式改写为线程安全的
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank1=Bank.getInstance();
        Bank bank2=Bank.getInstance();

        System.out.println(bank1==bank2);
    }

}

class Bank{
    private Bank(){}

    private static Bank instance =null;

    public static Bank getInstance(){
        //效率稍低
//        synchronized (Bank.class){
//            if(instance==null){
//                instance=new Bank();
//            }
//            return instance;
//        }

        //效率稍高
        if(instance==null){
            synchronized (Bank.class){
                if(instance==null){
                    instance=new Bank();
                }
            }
        }
        return instance;
    }
}