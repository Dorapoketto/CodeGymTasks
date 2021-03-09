package zh.codegym.task.task10.task1015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
字符串列表数组
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //在此编写你的代码
        ArrayList<String>[] lists = new ArrayList[5];

        //List<ArrayList<String>> lists = new ArrayList<ArrayList<String>>();

        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"s","d","f","c","g");
        lists[0]=list1;


        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"s","d","f","c","g");
        lists[1] = list2;

        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list3,"s","d","f","c","g");
        lists[2] = list3;

        ArrayList<String> list4 = new ArrayList<>();
        Collections.addAll(list4,"s","d","f","c","g");
        lists[3] = list4;

        ArrayList<String> list5 = new ArrayList<>();
        Collections.addAll(list5,"s","d","f","c","g");
        lists[4] = list5;

        return lists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}