package zh.codegym.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
最短或最长
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        int max_num = 0;
        int min_num = 0;
        ArrayList<String> arrayList = new ArrayList<String>();
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<10;i++){
            arrayList.add(br.readLine());
        }
        String max=arrayList.get(0);
        for(int i=0;i<10;i++){
            if(max.length()<arrayList.get(i).length()){
                max=arrayList.get(i);
                max_num=i;
            }

        }
        String min=arrayList.get(0);
        for(int j=0;j<10;j++){
            if(min.length()>arrayList.get(j).length()){
                min=arrayList.get(j);
                min_num=j;
            }

        }
        if(max_num<min_num){
            System.out.println(arrayList.get(max_num));
        }else{
            System.out.println(arrayList.get(min_num));
        }
    }
}
