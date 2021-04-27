package zh.codegym.task.task18.task1816;

/* 
ABC
*/

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        int count = 0;
        try (FileReader fileReader = new FileReader(args[0])) {
            while (fileReader.ready()){
                int n = fileReader.read();
                if((n>= 65 && n<91)||(n>96 && n<123)){
                    count++;
                }
            }
            System.out.println(count);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
