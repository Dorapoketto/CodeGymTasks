package zh.codegym.task.task17.task1709;

/* 
建议
*/

public class Solution {

    public static volatile int proposal = 0;

    public static void main(String[] args) {
        new AcceptProposal().start();
        new MakeProposal().start();
    }

    public static class MakeProposal extends Thread {
        @Override
        public void run() {
            int thisProposal = proposal;

            while (proposal < 10) {
                System.out.println("所提的建议数 " + (thisProposal + 1));
                proposal = ++thisProposal;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class AcceptProposal extends Thread {
        @Override
        public void run() {
            int thisProposal = proposal;

            while (thisProposal < 10) {
                if (thisProposal != proposal) {
                    System.out.println("接受的建议数 " + proposal);
                    thisProposal = proposal;
                }
            }
        }
    }
}
