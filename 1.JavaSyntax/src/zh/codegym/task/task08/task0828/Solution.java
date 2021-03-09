package zh.codegym.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
月份编号
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //在此编写你的代码
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> map = new HashMap<String, Integer>(){
            {
                put("January",1);
                put("February",2);
                put("March",3);
                put("April",4);
                put("May",5);
                put("June",6);
                put("July",7);
                put("August",8);
                put("September",9);
                put("October",10);
                put("November",11);
                put("December",12);
            }
        };

        String moon = bufferedReader.readLine();
        for(String temp:map.keySet()){
            if(temp.equals(moon)){
                System.out.printf("%s 是第 %d 个月",moon,map.get(moon));
            }
        }
    }
}
