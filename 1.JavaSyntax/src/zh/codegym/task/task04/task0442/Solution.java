package zh.codegym.task.task04.task0442;


/* 
相加
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        Scanner scanner = new Scanner(System.in);
        int sum  = 0;

        while (true){
            int number = scanner.nextInt();
            if (number == -1){
                sum = sum - 1;
                break;
            }
            sum += number;
        }
        System.out.println(sum);
    }
}
