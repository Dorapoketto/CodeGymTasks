package zh.codegym.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
不同类型的不同方法
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s;
        while (!(s = reader.readLine()).equals("exit")) {
            try {
            if (s.contains(".")) {
                print(Double.parseDouble(s));
            } else {
                    int i = Integer.parseInt(s);
                    if (i > 0 && i < 128) {
                        print((short) i);
                    } else {
                        print(i);
                    }
                }
            }
            catch (Exception e) {
                print((String) s);
            }
        }
        reader.close();
    }

    public static void print(Double value) {
        System.out.println("这是一个 Double。Value: " + value);
    }

    public static void print(String value) {
        System.out.println("这是一个 String。Value: " + value);
    }

    public static void print(short value) {
        System.out.println("这是一个 short。Value: " + value);
    }

    public static void print(Integer value) {
        System.out.println("这是一个 Integer。Value: " + value);
    }
}
