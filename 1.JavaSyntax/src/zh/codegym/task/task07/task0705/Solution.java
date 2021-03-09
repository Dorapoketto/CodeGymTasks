package zh.codegym.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
一个大数组和两个小数组
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        Scanner scanner=new Scanner(System.in);
        int[] arr = new int[20];
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        for(int i =0;i<20;i++){
            arr[i]=scanner.nextInt();
        }
        for(int i1=0;i1<10;i1++){
            arr1[i1]=arr[i1];
        }
        for(int i2=0;i2<10;i2++){
            arr2[i2]=arr[i2+10];
        }
        for(int j=0;j<10;j++){
            System.out.println(arr2[j]);
        }
    }
}
