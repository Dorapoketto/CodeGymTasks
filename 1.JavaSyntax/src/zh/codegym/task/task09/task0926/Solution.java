package zh.codegym.task.task09.task0926;

import java.util.ArrayList;
import java.util.Collections;

/* 
数字数组列表
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //在此编写你的代码
        ArrayList<int[]> arrayList = new ArrayList<>();
        int[] list1 = {1,2,3,4,5};
        int[] list2 = {1,2};
        int[] list3 = {1,2,3,4};
        int[] list4 = {1,2,3,4,5,6,7};
        int[] list5 = {};

        Collections.addAll(arrayList,list1,list2,list3,list4,list5);
        return arrayList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
