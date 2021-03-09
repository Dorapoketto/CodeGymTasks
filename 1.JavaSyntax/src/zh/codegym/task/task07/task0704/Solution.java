package zh.codegym.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
翻转数组
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        Scanner scanner=new Scanner(System.in);
        int[] arr = new int[10];
        for(int i =0;i<10;i++){
            arr[i]=scanner.nextInt();
        }
        for(int j =9;j>-1;j--){
            System.out.println(arr[j]);
        }
    }
}

