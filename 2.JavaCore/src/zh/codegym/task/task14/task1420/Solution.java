package zh.codegym.task.task14.task1420;

/* 
最大公约数 (GCD)
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader =  new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());

        getCommonDivisor(a, b);
        bufferedReader.close();
    }

    static void getCommonDivisor(int a, int b) throws IllegalAccessException {
        if (a <1 || b < 1){
            throw new IllegalAccessException();
        }

        if (a < b){
            int temp = a;
            a = b;
            b = temp;
        }

        int result = 0;
        for (int i = 1; i <= b; i++){
            if (a % i == 0 && b % i==0){
                result = i;
            }
        }

        System.out.println(result);
    }
}
