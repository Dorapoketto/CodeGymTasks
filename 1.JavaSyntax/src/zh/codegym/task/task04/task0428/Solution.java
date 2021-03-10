package zh.codegym.task.task04.task0428;

/* 
正数
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        list.add(a);
        list.add(b);
        list.add(c);

        for (Integer x : list){
            if (x > 0){
                count++;
            }
        }

        System.out.println(count);

    }
}
