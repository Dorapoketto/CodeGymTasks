package zh.codegym.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
寂寞数组之间的互动
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        Scanner scanner=new Scanner(System.in);
        String[] str = new String[10];
        int[] arr = new int[10];
        for(int i =0;i<10;i++){
            str[i]=scanner.next();
        }
        for(int j=0;j<10;j++){
            arr[j] = str[j].length();
        }

        for(int q=0;q<10;q++){
            System.out.println(arr[q]);
        }
    }
}
