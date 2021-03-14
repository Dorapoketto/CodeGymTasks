package zh.codegym.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Static 修饰符：第 1 部分
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<>();

    static {
        labels.put(1.0, "1");
        labels.put(2.0, "2");
        labels.put(3.0, "1");
        labels.put(4.0, "2");
        labels.put(5.0, "2");


    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
