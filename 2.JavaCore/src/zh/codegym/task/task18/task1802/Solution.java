package zh.codegym.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
数量最小的字节
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();

        FileInputStream fileInputStream = new FileInputStream(fileName);
        int minByte = 255;
        while (fileInputStream.available() > 0){
            int currentByte = fileInputStream.read();
            if (minByte > currentByte)
                minByte = currentByte;
        }

        System.out.println(minByte);
        fileInputStream.close();
        bufferedReader.close();

    }
}
