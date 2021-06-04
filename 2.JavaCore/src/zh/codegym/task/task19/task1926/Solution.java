package zh.codegym.task.task19.task1926;

/* 
镜像图像
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader bufferedReader1 = new BufferedReader(new FileReader(bufferedReader.readLine()))){

            while (bufferedReader1.ready()){
                char[] chars = bufferedReader1.readLine().toCharArray();
                for (int i = chars.length-1; i>-1; i--)
                    System.out.print(chars[i]);
                System.out.println(" ");
            }

        }catch (IOException ignored){

        }
    }
}
