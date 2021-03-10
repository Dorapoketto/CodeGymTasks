package zh.codegym.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
只针对富人
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Stallone", 500);
        map.put("Stallone2", 300);
        map.put("Stallone3", 100);
        map.put("Schwarzenegger", 2000);
        map.put("Schwarzenegger2", 200);
        map.put("Schwarzenegger3", 600);
        map.put("Willis", 700);
        map.put("Willis2", 850);
        map.put("Willis3", 725);
        map.put("Stallone4", 530);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue() < 500)
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}