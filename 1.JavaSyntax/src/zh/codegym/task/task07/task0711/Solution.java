package zh.codegym.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
删除和插入
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        ArrayList<String> arrayList = new ArrayList<String>();
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<5;i++){
            arrayList.add(br.readLine());
        }
        for(int j=0;j<13;j++){
            String temp = arrayList.get(-1);
            arrayList.remove(-1);
            arrayList.add(0,temp);
        }
        for(int i=0;i<5;i++){
            System.out.println(arrayList.get(i));
        }
    }
}
