package zh.codegym.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
检查顺序
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //在此编写你的代码
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(br.readLine());
        }
        int flag=-1;
        for(int j=0;j<list.size()-1;j++){
            if(list.get(j).length()>list.get(j+1).length()){
                flag=j+1;
                break;
            }
        }
        if(flag>-1) System.out.println(flag);
    }
}

