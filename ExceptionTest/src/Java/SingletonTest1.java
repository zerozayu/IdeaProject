package Java;

import java.sql.SQLOutput;

/**
 * @author zhangyu
 * @date 2020/3/19 - 20:25
 *
 * 饿汉式单例模式
 *
 */
public class SingletonTest1 {
    public static void main(String[] args) {
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();

        System.out.println(bank1==bank2);
    }

}

class Bank{
    private Bank(){

    }

    private static Bank instance =new Bank();

    public static Bank getInstance(){
        return instance;
    }
}