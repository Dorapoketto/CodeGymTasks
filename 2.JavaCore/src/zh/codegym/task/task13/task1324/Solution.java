package zh.codegym.task.task13.task1324;

import java.awt.*;

/* 
一个类中的一个方法
*/

public class Solution {

    public static void main(String[] args) {
    }

    public interface Animal {
        Color getColor();

        Integer getAge();
    }

    public abstract static class Fox implements Animal{
        public String getName() {
            return "狐狸";
        }

    }
}
