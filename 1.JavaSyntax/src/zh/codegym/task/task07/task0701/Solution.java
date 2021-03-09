package zh.codegym.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
数组中的最大值
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // 创建并填充数组
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[20];
        for(int i =0;i<20;i++){
            arr[i]=scanner.nextInt();
        }
        return arr;
    }

    public static int max(int[] array) {
        // 找出最大值
        int max = array[0];
        for(int i =0;i<20;i++){
            if(max<array[i]){
                max=array[i];
            }
        }
        return max;
    }
}
