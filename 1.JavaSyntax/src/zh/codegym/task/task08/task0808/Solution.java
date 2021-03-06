package zh.codegym.task.task08.task0808;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
一万次删除和插入
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // ArrayList
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        // LinkedList
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
    }

    public static void insert10000(List list) {
        //在此编写你的代码
        for(int i=0;i<10000;i++){
            list.add(i);
        }

    }

    public static void get10000(List list) {
        //在此编写你的代码
        for(int i=0;i<10000;i++){
            list.get(i);
        }
    }

    public static void set10000(List list) {
        //在此编写你的代码
        for(int i=0;i<10000;i++){
            list.set(i,1);
        }
    }

    public static void remove10000(List list) {
        //在此编写你的代码
        for(int i=0;i<10000;i++){
            list.remove(0);
        }
    }
}
