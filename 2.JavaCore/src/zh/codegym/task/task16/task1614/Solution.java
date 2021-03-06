package zh.codegym.task.task16.task1614;

import java.util.ArrayList;
import java.util.List;

/* 
倒数
*/

public class Solution {

    public static volatile List<String> list = new ArrayList<>(5);

    static {
        for (int i = 0; i < 5; i++) {
            list.add("行 " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Countdown(3), "倒数");
        t.start();
    }

    public static class Countdown implements Runnable {
        private int countFrom;

        public Countdown(int countFrom) {
            this.countFrom = countFrom;
        }

        public void run() {
            try {
                while (countFrom > 0) {
                    printCountdown();
                }
            } catch (InterruptedException ignored) {
            }
        }

        public void printCountdown() throws InterruptedException {
            //在此编写你的代码
            System.out.println(list.get(--countFrom));
            Thread.sleep(500);

        }
    }
}
