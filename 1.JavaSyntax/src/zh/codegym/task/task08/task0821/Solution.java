package zh.codegym.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
共享的姓氏和名字
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        //在此编写你的代码
        HashMap<String, String> map = new HashMap<>();
        map.put("a1", "b1");
        map.put("a2", "b1");
        map.put("a2", "b2");
        map.put("a3", "b1");
        map.put("a14", "b1");
        map.put("a15", "b1");
        map.put("a12", "b1");
        map.put("a16", "b1");
        map.put("a11", "b1");
        map.put("a18", "b1");



        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
