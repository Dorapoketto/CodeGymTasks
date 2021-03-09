package zh.codegym.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
复制单词
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // 从控制台读取字符串并在此声明 ArrayList
        ArrayList<String> list =new ArrayList<>();
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        for (int i=0;i<10;i++){
            list.add(br.readLine());
        }

        ArrayList<String> result = doubleValues(list);

        // 显示结果
        for(String str:result){
            System.out.println(str);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //在此编写你的代码
        int n = 2*list.size();
        int i=0;
        while (i<n){
            String temp=list.get(i);
            list.add(i+1,temp);
            i+=2;
        }

        return list;
    }
}
