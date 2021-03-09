package zh.codegym.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
基于控制台的存钱罐
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int sum =0;
        while (true)
        {
            String s = buffer.readLine();
            if (s.equals("总和")){
                break;}
            int number = Integer.parseInt(s);
            sum+=number;
        }
        System.out.println(sum);
    }
}
