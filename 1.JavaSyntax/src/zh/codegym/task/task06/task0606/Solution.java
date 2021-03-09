package zh.codegym.task.task06.task0606;

import java.io.*;
import java.util.Arrays;

/* 
偶数和奇数
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //在此编写你的代码
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String data = bufferedReader.readLine();

        String[] array = data.split("(?<=.)");

        for(String x: array){
            if(Integer.parseInt(x) % 2 == 0){
                even++;
            }else {
                odd++;
            }
        }

        System.out.println("偶数: " + even + " 奇数: " + odd);
    }
}
