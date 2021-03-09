package zh.codegym.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
玩 Javarella
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();

        for(int i=0;i<20;i++){
            list.add(Integer.parseInt(br.readLine()));
        }

        for(int j=0;j<20;j++){
            if(list.get(j)%3==0||(list.get(j)%3==0&&list.get(j)%2==0)){
                list1.add(list.get(j));
            }
        }

        for(int q=0;q<20;q++){
            if(list.get(q)%2==0||(list.get(q)%3==0&&list.get(q)%2==0)){
                list2.add(list.get(q));
            }
        }

        for(int q=0;q<20;q++){
            if(list.get(q)%2!=0&&list.get(q)%3!=0){
                list3.add(list.get(q));
            }
        }

        printList(list1);
        printList(list2);
        printList(list3);
    }

    public static void printList(List<Integer> list) {
        //在此编写你的代码
        for(Integer x:list){
            System.out.println(x);
        }
    }
}
