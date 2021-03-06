package zh.codegym.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
及时洗牌
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //在此编写你的代码
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        ArrayList<String> list = new ArrayList<>();

        for(int i=0;i<n;i++){
            list.add(reader.readLine());
        }

        for(int j=0;j<m;j++){
            String str = list.get(j);
            list.add(str);
        }

        for(int j=0;j<m;j++){
            list.remove(0);
        }

        for(String x:list){
            System.out.println(x);
        }
    }
}
