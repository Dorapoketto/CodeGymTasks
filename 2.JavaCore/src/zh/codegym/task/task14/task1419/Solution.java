package zh.codegym.task.task14.task1419;

import java.util.ArrayList;
import java.util.List;

/* 
引入异常
*/

public class Solution {

    public static List<Exception> exceptions = new ArrayList<>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   // 第一个异常
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //在此编写你的代码
        exceptions.add(new RuntimeException());
        exceptions.add(new NullPointerException());
        exceptions.add(new ArrayStoreException());
        exceptions.add(new ClassCastException());
        exceptions.add(new ArrayIndexOutOfBoundsException());
        exceptions.add(new ClassNotFoundException());
        exceptions.add(new CloneNotSupportedException());
        exceptions.add(new IndexOutOfBoundsException());
        exceptions.add(new IllegalAccessException());

    }
}
