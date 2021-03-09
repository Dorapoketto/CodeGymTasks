package zh.codegym.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
走向全国
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //在此编写你的代码
        String[] strs = s.split(" ");
        for(int i=0; i<strs.length;i++){
            strs[i] = strs[i].substring(0,1).toUpperCase()+strs[i].substring(1);
        }

        String result = "";
        for(String str:strs){
            result += str + " ";
        }

        result=result.substring(0,result.length()-1);
        System.out.println(result);
    }
}
