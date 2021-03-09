package zh.codegym.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
以相反顺序显示字符串数组
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String[10];
        for(int i=0;i<8;i++){
            arr[i]=scanner.next();
        }
        for(int j=9;j>=0;j--){
            System.out.println(arr[j]);
        }
    }
}