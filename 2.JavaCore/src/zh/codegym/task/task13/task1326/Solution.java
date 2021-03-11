package zh.codegym.task.task13.task1326;

/* 
对文件中的偶数进行排序
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        //在此编写你的代码
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(fileInputStream);

        while (scanner.hasNext()){
            int number = scanner.nextInt();
            if (number %2 == 0)
                list.add(number);
        }

        Collections.sort(list);

        for (int x : list){
            System.out.println(x);
        }

        bufferedReader.close();
        fileInputStream.close();
    }
}
