package shuzu;

import java.util.Scanner;

/**
 * @author zhangyu
 * @date 2020/3/18 - 23:26
 */
public class shuzu {
    public static void main(String[] args) {
        int num[]={1,2,3,4,4,4,5,6};
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int first = 0,last=0,sign=0;
        try {
            for(int i=0;i<num.length;i++){
                if(n==num[i]&&sign==0){
                    first=i;
                    sign=1;
                    last=i;
                }

                if(n==num[i+1]&&sign==1){
                    last=i+1;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.printf("[%d,%d]",first,last);
    }
}
