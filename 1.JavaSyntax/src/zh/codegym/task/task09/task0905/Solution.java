package zh.codegym.task.task09.task0905;

/* 
在堆栈跟踪的蓝色深度中…
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        // 在此编写你的代码
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int n = stackTraceElements.length;
        System.out.println(n);
        return n;
    }
}

