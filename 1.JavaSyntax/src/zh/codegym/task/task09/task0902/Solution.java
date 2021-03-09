package zh.codegym.task.task09.task0902;

/* 
重访堆栈跟踪
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static String method1() {
        method2();
        //在此编写你的代码
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return  stackTraceElements[2].getMethodName();
    }

    public static String method2() {
        method3();
        //在此编写你的代码
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return  stackTraceElements[2].getMethodName();
    }

    public static String method3() {
        method4();
        //在此编写你的代码
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return  stackTraceElements[2].getMethodName();
    }

    public static String method4() {
        method5();
        //在此编写你的代码
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return  stackTraceElements[2].getMethodName();
    }

    public static String method5() {
        //在此编写你的代码
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return  stackTraceElements[2].getMethodName();
    }
}
