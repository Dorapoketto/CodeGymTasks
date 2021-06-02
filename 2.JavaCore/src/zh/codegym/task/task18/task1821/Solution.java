package zh.codegym.task.task18.task1821;

/* 
符号频率
*/

import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader(args[0]);

        int[] chars = new int[128];

        while (fileReader.ready()){
            int x = fileReader.read();
            chars[x]++;
        }

        for (int i=0; i<chars.length; i++){
            if (chars[i] != 0)
                System.out.println((char)i + " " +chars[i]);
        }

        fileReader.close();
    }
}
