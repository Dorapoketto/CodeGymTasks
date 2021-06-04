package zh.codegym.task.task18.task1822;

/* 
查找文件中的数据
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {

        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader bufferedReader1 = new BufferedReader(new FileReader(bufferedReader.readLine())) ){

            String str;
            while ((str = bufferedReader1.readLine()) != null){
                if (str.startsWith(args[0] + " ")){
                    System.out.println(str);
                    break;
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
