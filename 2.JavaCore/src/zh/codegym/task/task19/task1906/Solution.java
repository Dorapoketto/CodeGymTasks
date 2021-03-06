package zh.codegym.task.task19.task1906;

/* 
偶数字符
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();
        bufferedReader.close();

        ArrayList<Integer> list = new ArrayList<>();
        try(FileReader fileReader = new FileReader(fileName1)){
            while (fileReader.ready()){
                list.add(fileReader.read());
            }
        }

        try (FileWriter fileWriter = new FileWriter(fileName2)){
            for (int i=1; i<list.size(); i=i+2){
                fileWriter.write(list.get(i));
            }
        }
    }
}
