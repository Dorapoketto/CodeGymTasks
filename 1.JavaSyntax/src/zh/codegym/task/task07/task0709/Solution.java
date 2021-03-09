package zh.codegym.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
更简洁地表达自己
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<5;i++){
            strings.add(br.readLine());
        }
        ArrayList<String> min_str=new ArrayList<>();
        int min=strings.get(0).length();
        for(int i=0;i<5;i++){
            if(min>strings.get(i).length()){
                min = strings.get(i).length();
            }
        }
        for(int j=0;j<5;j++){
            if(strings.get(j).length() == min){
                min_str.add(strings.get(j));
            }
        }
        for(int i=0;i<min_str.size();i++){
            System.out.println(min_str.get(i));
        }
    }
}
