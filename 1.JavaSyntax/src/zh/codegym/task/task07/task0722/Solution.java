package zh.codegym.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
结束
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //在此编写你的代码
        ArrayList<String> list =new ArrayList<>();
        for(int i=0;i>-1;i++){
            String str = reader.readLine();
            if("结束".equals(str)){
                break;
            }
            list.add(str);
        }
        for(String x:list){
            System.out.println(x);
        }
    }
}