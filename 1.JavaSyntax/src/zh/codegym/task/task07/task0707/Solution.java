package zh.codegym.task.task07.task0707;

import java.util.ArrayList;

/* 
那是什么类型的列表？
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        ArrayList<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        System.out.println(list.size());
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));
        }
    }
}
