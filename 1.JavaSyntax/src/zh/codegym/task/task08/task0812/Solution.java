package zh.codegym.task.task08.task0812;

import java.io.*;
import java.util.*;

/* 
最长序列
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //在此编写你的代码
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (Integer integer : list) {
            if (map.containsKey(integer)) {
                map.put(integer, map.get(integer) + 1);
            } else {
                map.put(integer, 1);
            }
        }
        int count=0;

        for (Map.Entry<Integer, Integer> pair : map.entrySet())
        {
            Integer value = pair.getValue();                  // 值
            if(count<value) {
                count = value;
            }
        }
        System.out.println(count);
    }
}