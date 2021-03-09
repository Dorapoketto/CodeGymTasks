package zh.codegym.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
有关算法的任务
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        // 在此编写你的代码
    }

    // 字符串比较方法：‘a’大于‘b’
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // 传递的字符串是数字吗？
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // 字符串包含连字符
                    || (!Character.isDigit(c) && c != '-') // 或不是数字并且不以连字符开头
                    || (i == 0 && c == '-' && chars.length == 1)) // 或为单个连字符
            {
                return false;
            }
        }
        return true;
    }
}
