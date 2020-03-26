package Java;

import java.awt.print.PrinterAbortException;

/**
 * @author zhangyu
 * @date 2020/3/19 - 20:37
 */
public class SingletonTest2 {
    public static void main(String[] args) {
        Bank ins1 = Bank.getInstance();
        Bank ins2 = Bank.getInstance();

        System.out.println(ins1==ins2);
    }
}

class Order{
    private Order(){

    }

    private static Order instance=null;

    public static Order getInstance(){
        if(instance==null){
            instance=new Order();
        }
        return instance;
    }
}
