package zh.codegym.task.task18.task1823;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 
线程和字节
*/

public class Solution {

    public static Map<String, Integer> resultMap = new HashMap<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name;
        while (! (name = scanner.next()).equals("退出")){
            new ReadThread(name).start();
        }

    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            // 实现构造方法主体
            this.fileName = fileName;
        }
        // 在此实现文件读取

        public void run(){

            byte[] bytes = new byte[256];
            try (FileInputStream fileInputStream = new FileInputStream(fileName)){

                while (fileInputStream.available() > 0){
                    int x = fileInputStream.read();
                    bytes[x]++;
                }

                int maxByte = 0;
                int count = 0;

                for (int i=0; i < bytes.length; i++){
                    if (bytes[i] > count){
                        count = bytes[i];
                        maxByte = i;
                    }
                }

                resultMap.put(fileName, maxByte);

            }catch (IOException e){

            }
        }
    }
}
