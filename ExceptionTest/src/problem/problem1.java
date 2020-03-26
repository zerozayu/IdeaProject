package problem;

import jdk.nashorn.internal.ir.ReturnNode;

/**
 * 获取一个字符串在另一个字符串中中出现的次数
 *
 * @author zhangyu
 * @date 2020/3/25 - 19:45
 */
public class problem1 {
    public static void main(String[] args) {
        problem1 p1 = new problem1();
        System.out.println(p1.strNums("as","asdefkgnrjeasnfgnrinasfiwjfienasdkokasokf"));
    }

    public int strNums(String str1, String str2) {
        int count = 0;
        int index = 0;
        while (str2.indexOf(str1, index) != -1) {
            count++;
            index=str2.indexOf(str1,index)+str1.length();
//            System.out.println(index);
        }
        return count;
    }
}

