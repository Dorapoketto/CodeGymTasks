package zh.codegym.task.task09.task0903;

/* 
调用我的对象是谁？
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static int method1() {
        method2();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int n = stackTraceElements[2].getLineNumber();
        return  /*在此编写你的代码*/ n;
    }

    public static int method2() {
        method3();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int n = stackTraceElements[2].getLineNumber();
        return  /*在此编写你的代码*/ n;
    }

    public static int method3() {
        method4();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int n = stackTraceElements[2].getLineNumber();
        return  /*在此编写你的代码*/ n;
    }

    public static int method4() {
        method5();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int n = stackTraceElements[2].getLineNumber();
        return  /*在此编写你的代码*/ n;
    }

    public static int method5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int n = stackTraceElements[2].getLineNumber();
        return  /*在此编写你的代码*/ n;
    }
}
