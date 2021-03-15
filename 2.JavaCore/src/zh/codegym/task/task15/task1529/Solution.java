package zh.codegym.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
掌握 static 块
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        //在此编写你的代码
        reset();
    }

    public static CanFly result;

    public static void reset() {
        //在此编写你的代码
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int x = 0;
        try {
            String s = bufferedReader.readLine();
            if (s.equals("plane"))
                x = Integer.parseInt(bufferedReader.readLine());
                result = new Plane(x);

            if (s.equals("helicopter"))
                result = new Helicopter();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
