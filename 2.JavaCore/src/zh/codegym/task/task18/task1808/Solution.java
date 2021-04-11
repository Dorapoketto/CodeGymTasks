package zh.codegym.task.task18.task1808;

/* 
分割文件
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();
        String fileName3 = bufferedReader.readLine();

        FileInputStream fileInputStream = new FileInputStream(fileName1);
        FileOutputStream fileOutputStream1 = new FileOutputStream(fileName2);
        FileOutputStream fileOutputStream2 = new FileOutputStream(fileName3);

        int halfOfFile = (fileInputStream.available() + 1) / 2;
        int numberOfByte = 0;
        while (fileInputStream.available() > 0){
            if (numberOfByte < halfOfFile) {
                fileOutputStream1.write(fileInputStream.read());
                numberOfByte++;
            }
            else fileOutputStream2.write(fileInputStream.read());
        }

        bufferedReader.close();
        fileInputStream.close();
        fileOutputStream1.close();
        fileOutputStream2.close();
    }
}
