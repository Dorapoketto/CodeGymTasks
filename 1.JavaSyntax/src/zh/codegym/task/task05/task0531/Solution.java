package zh.codegym.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
改进功能
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());


        int minimum = min(a, b,c,d,e);

        System.out.println("最小值 = " + minimum);
    }

    public static int min(int a, int b,int c, int d,int e) {
        int x = Math.min(a,b);
        int y = Math.min(c,d);
        int z = Math.min(x,y);
        int min = Math.min(z,e);
        return min;
    }
}
