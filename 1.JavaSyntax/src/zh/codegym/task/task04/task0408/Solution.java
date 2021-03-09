package zh.codegym.task.task04.task0408;

/* 
好还是不好？
*/

public class Solution {

    public static void main(String[] args) {
        compare(3);
        compare(6);
        compare(5);
    }

    public static void compare(int a) {
        if (a < 5) {
            System.out.println("数字小于 5");
        } else if (a > 5) {
            System.out.println("数字大于 5");
        } else {
            System.out.println("数字等于 5");
        }
    }
}