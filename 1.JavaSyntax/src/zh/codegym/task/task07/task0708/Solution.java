package zh.codegym.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
最长的字符串
*/

public class Solution {
    //在此编写你的代码
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<5;i++){
            strings.add(br.readLine());
        }
        ArrayList<String> max_str=new ArrayList<>();
        int max=strings.get(0).length();
        for(int i=0;i<5;i++){
            if(max<strings.get(i).length()){
                max = strings.get(i).length();
            }
        }
        for(int j=0;j<5;j++){
            if(strings.get(j).length() == max){
                max_str.add(strings.get(j));
            }
        }
        for(int i=0;i<max_str.size();i++){
            System.out.println(max_str.get(i));
        }
    }
}
