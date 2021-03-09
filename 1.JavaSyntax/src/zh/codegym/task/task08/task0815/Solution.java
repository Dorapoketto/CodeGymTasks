package zh.codegym.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
人口普查
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //在此编写你的代码
        HashMap<String, String> map = new HashMap<String, String>(){
            {
                put("卢","1");
                put("马","2");
                put("赵","3");
                put("钱","4");
                put("孙","5");
                put("李","1");
                put("姚","2");
                put("诸葛","3");
                put("南宫","4");
                put("北冥","5");
            }
        };
        return map;
    }

    public static int getSameFirstNameCount(HashMap<String, String> map, String name) {
        //在此编写你的代码
        int count = 0;
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            String n = iterator.next().getValue();
            if(name.equals(n)){
                count++;
            }
        }
        return count;
    }

    public static int getSameLastNameCount(HashMap<String, String> map, String lastName) {
        //在此编写你的代码
        int count = 0;
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            String n = iterator.next().getKey();
            if(lastName.equals(n)){
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {

    }
}
