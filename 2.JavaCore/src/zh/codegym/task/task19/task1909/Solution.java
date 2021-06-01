package zh.codegym.task.task19.task1909;

/* 
更改标点符号
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();
        bufferedReader.close();

        ArrayList<String> list = new ArrayList<>();
        try(BufferedReader bufferedReader1 = new BufferedReader(new FileReader(fileName1));
        ){
           while (bufferedReader1.ready()){
               list.add(bufferedReader1.readLine());
           }
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName2))){
            for (String x: list){
                bufferedWriter.write(x.replaceAll("\\.", "!"));
            }
        }
    }
}
