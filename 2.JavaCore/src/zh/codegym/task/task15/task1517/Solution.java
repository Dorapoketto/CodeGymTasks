package zh.codegym.task.task15.task1517;

/* 
Static 修饰符和异常
*/

public class Solution {

    public static int A = 0;

    static {
        // 在此抛出异常
        if (true)
            throw new RuntimeException("");
    }

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}
