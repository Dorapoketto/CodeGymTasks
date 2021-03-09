package zh.codegym.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
更改功能
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        final int size = list.size();
        for (int i = 0; i < size; i++) {
            String s = list.get(i);
            if(s.length()%2==0){
                list.add(s);
                list.add(s);
            }else if(s.length()%3==0) {
                list.add(s);
                list.add(s);
                list.add(s);
            }
        }
        for(int i=0;i<size;i++){
            list.remove(0);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
