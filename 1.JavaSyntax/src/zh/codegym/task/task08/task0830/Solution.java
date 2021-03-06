package zh.codegym.task.task08.task0830;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
有关算法的任务
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        //在此编写你的代码
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(isGreaterThan(array[j],array[j+1])){
                    String temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }

    // 字符串比较方法：‘a’大于‘b’
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
