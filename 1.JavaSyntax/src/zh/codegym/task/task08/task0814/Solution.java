package zh.codegym.task.task08.task0814;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
大于 10？你不适合我们
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        // 在此编写你的代码
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<20;i++){
            set.add(i);
        }
        return set;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        // 在此编写你的代码
        set.removeIf(integer -> integer > 10);
        return set;
    }

    public static void main(String[] args) {
        HashSet<Integer> set = createSet();
        removeAllNumbersGreaterThan10(set);
    }
}
