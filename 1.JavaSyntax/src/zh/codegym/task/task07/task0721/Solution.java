package zh.codegym.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
数组中的最小值和最大值
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] data = new int[20];
        for (int i = 0; i < data.length; i++) {
            data[i] = Integer.parseInt(reader.readLine());
        }

        int maximum = data[0];
        int minimum = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > maximum)
                maximum = data[i];

            if (data[i] < minimum)
                minimum = data[i];
        }
        System.out.print(maximum + " " + minimum);
    }
}
