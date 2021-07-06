package zh.codegym.task.task19.task1923;

/* 
包含数字的字词
*/

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        String file1 = args[0];
        String file2 = args[1];

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file1));
            FileWriter fileWriter = new FileWriter(file2)){

            Pattern pattern = Pattern.compile(".*[0-9].*");
            while (bufferedReader.ready()){
                String line = bufferedReader.readLine();
                List<String> lists = Arrays.asList(line.split(" "));
                for (String x: lists) {
                    Matcher matcher = pattern.matcher(x);
                    if (matcher.matches()){
                        fileWriter.write(x+" ");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
