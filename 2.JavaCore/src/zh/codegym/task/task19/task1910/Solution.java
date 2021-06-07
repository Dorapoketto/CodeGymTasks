package zh.codegym.task.task19.task1910;

/* 
标点符号
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();

        try (BufferedReader bufferedReader1 = new BufferedReader(new FileReader(fileName1));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName2))){
            List<String> list = new ArrayList<>();
            while (bufferedReader1.ready()){
                list.add(bufferedReader1.readLine());
            }

            for (String x:
                 list) {
                bufferedWriter.write(x.replaceAll("\\p{P}",""));
            }

        }
        bufferedReader.close();
    }
}
