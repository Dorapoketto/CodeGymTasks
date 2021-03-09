package zh.codegym.task.task09.task0904;

/* 
10 次调用的堆栈跟踪
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int stackTraceLength = method1().length - method10().length + 1;
    }

    public static StackTraceElement[] method1() {
        return method2();
    }

    public static StackTraceElement[] method2() {
        //在此编写你的代码
        return method3();
    }

    public static StackTraceElement[] method3() {
        //在此编写你的代码
        return method4();
    }

    public static StackTraceElement[] method4() {
        //在此编写你的代码
        return method5();
    }

    public static StackTraceElement[] method5() {
        //在此编写你的代码
        return method6();
    }

    public static StackTraceElement[] method6() {
        //在此编写你的代码
        return method7();
    }

    public static StackTraceElement[] method7() {
        //在此编写你的代码
        return method8();
    }

    public static StackTraceElement[] method8() {
        //在此编写你的代码
        return method9();
    }

    public static StackTraceElement[] method9() {
        return method10();
    }

    public static StackTraceElement[] method10() {
        return Thread.currentThread().getStackTrace();
    }
}
