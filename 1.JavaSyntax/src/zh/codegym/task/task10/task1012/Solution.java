package zh.codegym.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
字母数
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 字母
        String abc = "abcdefghijklmnopqrstuvwxyz";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<>();
        for (char letter : abcArray) {
            alphabet.add(letter);
        }

        // 读取字符串
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        // 在此编写你的代码
        for(Character cha:alphabet){
            int count=0;
            for(String str:list){
                char[] chars = str.toCharArray();
                for(char temp:chars){
                    if (cha.equals(temp)){
                        count++;
                    }
                }
            }
            System.out.println(cha+" "+count);
        }
    }
}
