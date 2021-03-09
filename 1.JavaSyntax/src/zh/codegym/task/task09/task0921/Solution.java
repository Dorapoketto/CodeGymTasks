package zh.codegym.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
try-catch 中的方法
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //在此编写你的代码
        List<Integer> lists = null;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            lists = new ArrayList<>();
            while (true) {
                lists.add(Integer.parseInt(br.readLine()));
            }

        } catch (NumberFormatException e) {
            //e.printStackTrace();
            for (Integer item : lists) {
                System.out.println(item);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
