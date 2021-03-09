package zh.codegym.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
功能还不够！
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Integer,String> map = new HashMap<>();
        while (true){
            String s = reader.readLine();
            if(s.isEmpty()){
                break;
            }
            int id = Integer.parseInt(s);
            String name = reader.readLine();
            map.put(id,name);
            System.out.println(id + " " + map.get(id));
        }

//        for(HashMap.Entry<Integer,String> item:map.entrySet()){
//            System.out.println(item.getKey() + " " + item.getValue());
//        }

    }
}
