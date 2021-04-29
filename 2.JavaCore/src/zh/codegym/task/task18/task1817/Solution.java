package zh.codegym.task.task18.task1817;

/* 
空格
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream(args[0])){
            int n1=0, n2=0;
            while (fileInputStream.available() > 0){
                int read = fileInputStream.read();
                n1++;
                if(read == ' '){
                    n2++;
                }
            }
            double result = (double) n2/n1*100;
            System.out.printf("%.2f", result);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
