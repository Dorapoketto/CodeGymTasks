package zh.codegym.task.task16.task1618;

/* 
另一个中断
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //在此编写你的代码
        TestThread thread = new TestThread();
        thread.start();
        thread.interrupt();
    }

    //在此编写你的代码
    public static class TestThread extends Thread{

        public void run(){

        }
    }
}