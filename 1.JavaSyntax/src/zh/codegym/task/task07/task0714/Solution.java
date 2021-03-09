package zh.codegym.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* 
以相反顺序显示词语
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextLine());
        }

        list.remove(2);
        Collections.reverse(list);

        for (String s : list) {
            System.out.println(s);
        }
    }
}


