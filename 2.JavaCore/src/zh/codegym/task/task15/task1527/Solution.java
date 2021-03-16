package zh.codegym.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
请求解析器
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        //在此编写你的代码
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader( System.in));
        String s = bufferedReader.readLine();

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
