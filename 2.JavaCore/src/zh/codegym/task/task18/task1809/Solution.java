package zh.codegym.task.task18.task1809;

/* 
反转文件
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();

        FileInputStream fileInputStream = new FileInputStream(file1);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);

        List<Integer> inputBytes = new ArrayList<>();
        while (fileInputStream.available() > 0) {
            inputBytes.add(fileInputStream.read());
        }
        Collections.reverse(inputBytes);
        for (Integer aByte : inputBytes) {
            fileOutputStream.write(aByte);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
