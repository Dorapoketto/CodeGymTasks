package zh.codegym.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
搜索正确的行
*/

public class Solution {
    public static List<String> words = new ArrayList<>();

    static {
        words.add("文件");
        words.add("查看");
        words.add("在");
    }

    public static void main(String[] args) {

        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader bufferedReader1 = new BufferedReader(new FileReader(bufferedReader.readLine()))){

            while (bufferedReader1.ready()){
                String str = bufferedReader1.readLine();
                String[] strings = str.split(" ");

                int count=0;

                for (String s: strings) {
                    if (words.contains(s))
                        count++;
                }

                if (count == 2){
                    System.out.println(str);
                }
            }

        }catch (IOException e){

        }

    }
}
