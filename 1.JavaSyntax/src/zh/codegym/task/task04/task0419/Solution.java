package zh.codegym.task.task04.task0419;

/* 
四个数字中的最大值
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int max1 = Math.max(a, b);
        int max2 = Math.max(c, d);

        int max = Math.max(max1, max2);
        System.out.println(max);
    }
}
