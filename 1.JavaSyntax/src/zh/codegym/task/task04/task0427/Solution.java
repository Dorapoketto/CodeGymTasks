package zh.codegym.task.task04.task0427;

/* 
描述数字
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        Scanner scanner = new Scanner(System.in);
        String str1, str2;

        int data = scanner.nextInt();
        if (data > 999 || data<1){
            System.out.println();
        }else {

            if (data % 2 == 0) {
                str2 = "偶数";
            } else {
                str2 = "奇数";
            }

            String temp = Integer.toString(data);
            if (temp.length() == 3) {
                str1 = "三位";
            } else if (temp.length() == 2) {
                str1 = "两位";
            } else {
                str1 = "一位";
            }

            System.out.println(str1 + str2);
        }
    }
}
