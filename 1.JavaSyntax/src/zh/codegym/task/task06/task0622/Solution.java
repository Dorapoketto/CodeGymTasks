package zh.codegym.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
升序数字
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //在此编写你的代码
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int[] arr = new int[5];
        List<Integer> al = new ArrayList<Integer>();
        al.add(a);
        al.add(b);
        al.add(c);
        al.add(d);
        al.add(e);
        Collections.sort(al);
        for (int i:al){

        }
    }
}
