package zh.codegym.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
又见“我是山姆”
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list,"山姆","我","是");
        int i=1;
        while (i<6){
            list.add(i,"火腿");
            i=i+2;
        }
        for(int j=0;j<list.size();j++){
            System.out.println(list.get(j));
        }
    }
}
