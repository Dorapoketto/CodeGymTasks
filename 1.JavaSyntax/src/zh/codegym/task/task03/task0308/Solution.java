package zh.codegym.task.task03.task0308;

/* 
10 个数字的乘积
*/

public class Solution {
    public static void main(String[] args) {
        //在此编写你的代码
        int i=1;
        int result=i;
        while (i<11){
            result *= i;
            i++;
        }
        System.out.println(result);
    }
}
