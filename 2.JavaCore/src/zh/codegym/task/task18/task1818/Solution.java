package zh.codegym.task.task18.task1818;

/* 
合二为一
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();
        String fileName3 = bufferedReader.readLine();



        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName1);
             FileInputStream fileInputStream1 =  new FileInputStream(fileName2);
             FileInputStream fileInputStream2 = new FileInputStream(fileName3);){
            while (fileInputStream1.available() > 0){
                int readByte = fileInputStream1.read();
                fileOutputStream.write(readByte);
            }

            while (fileInputStream2.available() > 0){
                int readByte = fileInputStream2.read();
                fileOutputStream.write(readByte);
            }
        }

    }
}
