package zh.codegym.task.task05.task0532;

import java.io.*;

/* 
有关算法的任务
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        if(n>0) {
            int[] arr = new int[n];
            int x = Integer.parseInt(reader.readLine());
            arr[0] = x;
            int j = 0;
            int i = n;
            while (i > 1) {
                int number = Integer.parseInt(reader.readLine());
                if (number <= arr[j]) {
                    int temp = arr[j];
                    arr[j + 1] = temp;
                    arr[j] = number;
                } else {
                    arr[j + 1] = number;
                }
                j++;
                i--;
            }
            int maximum = arr[n-1];
            System.out.println(maximum);
        }


        //在此编写你的代码

    }
}
