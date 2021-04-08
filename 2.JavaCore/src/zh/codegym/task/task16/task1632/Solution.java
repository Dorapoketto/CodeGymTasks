package zh.codegym.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());

    }

    public static void main(String[] args) {
    }

    public static class Thread1 extends Thread{

        @Override
        public void run() {
            while (true){

            }
        }
    }

    public static class Thread2 extends Thread{

        @Override
        public void run() {
            try {
                throw new InterruptedException();
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }

    public static class Thread3 extends Thread{

        @Override
        public void run() {
            try {
                while (!isInterrupted()){
                    System.out.println("加油");
                    Thread.sleep(500);
                }
            }catch (InterruptedException e){

            }

        }
    }

    public static class Thread4 extends Thread implements Message{

        @Override
        public void run() {
            while (!isInterrupted()){
                
            }
        }

        @Override
        public void showWarning() {
            interrupt();
        }
    }

    public static class Thread5 extends Thread{
        @Override
        public void run() {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                String s = bufferedReader.readLine();
                int sum = 0;

                while(!"N".equals(s)){
                    sum += Integer.parseInt(s);
                    s = bufferedReader.readLine();
                }

                System.out.println(sum);
            }catch (IOException e ){

            }
        }
    }

}