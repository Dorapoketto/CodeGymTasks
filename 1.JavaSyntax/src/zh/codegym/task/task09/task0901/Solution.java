package zh.codegym.task.task09.task0901;

/* 
返回堆栈跟踪
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static StackTraceElement[] method1() {
        method2();
        //在此编写你的代码
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return  stackTraceElements;
    }

    public static StackTraceElement[] method2() {
        method3();
        //在此编写你的代码
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return  stackTraceElements;
    }

    public static StackTraceElement[] method3() {
        method4();
        //在此编写你的代码
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return  stackTraceElements;
    }

    public static StackTraceElement[] method4() {
        method5();
        //在此编写你的代码
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return  stackTraceElements;
    }

    public static StackTraceElement[] method5() {
        //在此编写你的代码
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return  stackTraceElements;
    }
}
