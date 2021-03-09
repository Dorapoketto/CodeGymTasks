package zh.codegym.task.task04.task0424;

/* 
三个数字
*/

import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] list = new int[3];

        for(int i =0; i < list.length; i++ ){
            list[i] = Integer.parseInt(br.readLine());
        }

        if (list[0] == list[1]){
            if(list[0] != list[2]){
                System.out.println(2);
            }else if(list[1] != list[2]){
                System.out.println(2);
            }
        }else {
            if(list[0] == list[2]){
                System.out.println(1);
            }else if(list[1] == list[2]){
                System.out.println(0);
            }
        }

    }

}
