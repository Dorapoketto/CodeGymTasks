package zh.codegym.task.task08.task0801;

/* 
包含植物的 HashSet
*/

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        HashSet<String> set = new HashSet<String>();
        Collections.addAll(set,"西瓜","香蕉","樱桃","梨","哈密瓜","黑莓","人参","草莓","鸢尾花","土豆");
        for (String str:set){
            System.out.println(str);
        }
    }
}
