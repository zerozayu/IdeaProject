package problem;

/**
 * 获取连个字符串中的最大字串
 *
 * @author zhangyu
 * @date 2020/3/25 - 20:17
 */
public class problem2 {
    public static void main(String[] args) {
        problem2 p2 = new problem2();
        System.out.println(p2.getMaxSameStr("asdfghjkasfahelloworldefsdsf", "qwerasdfasdawdhelloworldawdfesgsgfsdgssd"));
    }

    public String getMaxSameStr(String s1, String s2) {
        String str = new String();
        int start=0;
        int count=0;
        for (int i = 0; i < s1.length(); i++) {

//            System.out.println("i"+i);

            for (int j = i+1; j < s1.length(); j++) {

                str = s1.substring(i, j);

//                System.out.println("j"+j);
//                System.out.println(str);

                if(str.length()>count){
                    if (s2.indexOf(str) != -1) {
                        start=s2.indexOf(str);
                        count=j-i;
                    }
                    else{
                        break;
                    }
                }

            }

        }
        return s2.substring(start,start+count);
    }
}
