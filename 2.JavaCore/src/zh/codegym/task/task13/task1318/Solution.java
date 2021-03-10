package zh.codegym.task.task13.task1318;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileInputStream;

/* 
读取文件
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // 在此编写你的代码
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);

        StringBuilder stringBuilder = new StringBuilder();

        Scanner scanner = new Scanner(fileInputStream);

        while (scanner.hasNext()){
            stringBuilder.append(scanner.nextLine()).append("\n");
        }

        System.out.println(stringBuilder.toString());

        bufferedReader.close();
        fileInputStream.close();
    }
}