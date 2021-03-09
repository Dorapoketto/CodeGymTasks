package zh.codegym.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
街道和房屋
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        Scanner scanner=new Scanner(System.in);
        int[] arr = new int[15];
        for(int i=0;i<15;i++){
            arr[i]=scanner.nextInt();
        }
        int even=0;
        int odd=0;
        for(int j=0;j<15;j++){
            if(j%2==0){
                even +=arr[j];
            }else{
                odd +=arr[j];
            }
        }
        if(even>odd){
            System.out.println("居住在门牌号为偶数的房屋的居民更多。");
        }else{
            System.out.println("居住在门牌号为奇数的房屋的居民更多。");
        }
    }
}
