package zh.codegym.task.task08.task0817;

import java.util.*;

/* 
我们不需要重复的内容
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

    public static void removeFirstNameDuplicates(Map<String, String> map) {
        //在此编写你的代码

        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        //Collection<String> list =map.values();
        for(Map.Entry<String ,String > item:map.entrySet()){
            String familyName = item.getKey();
            String name =item.getValue();
            HashMap<String, String> copy = new HashMap<String, String>(map);
            copy.remove(familyName);
            if(copy.containsValue(name)){
                removeItemFromMapByValue(map,name);
            }

        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        //HashMap<String, String> copy = new HashMap<String, String>(map);
//        for (Map.Entry<String, String> pair : copy.entrySet()) {
//            if (pair.getValue().equals(value))
//                map.remove(pair.getKey());
//        }
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> item = iterator.next();
            if(item.getValue().equals(value)){
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> map = createMap();
        removeFirstNameDuplicates(map);
    }
}
