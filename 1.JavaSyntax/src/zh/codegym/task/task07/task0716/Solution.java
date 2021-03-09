package zh.codegym.task.task07.task0716;

import java.util.ArrayList;
import java.util.Collections;

/* 
R 或 L
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list,"rose","measure","love","lyre","wade","bark"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        // 在此编写你的代码
//        for(int i=0;i<list.size();i++){
//            if(list.get(i).contains("r")&&!list.get(i).contains("l")){
//                list.remove(i);
//            }
//        }
        list.removeIf(str -> str.contains("r") && !str.contains("l"));
        final int n = list.size();
        for(int i=0;i<n;i++){
            if(list.get(i).contains("l")&&!list.get(i).contains("r")){
                list.add(list.get(i));
            }
        }
        return list;
    }
}