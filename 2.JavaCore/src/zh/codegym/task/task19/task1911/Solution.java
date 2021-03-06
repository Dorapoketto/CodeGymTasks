package zh.codegym.task.task19.task1911;

/* 
Reader 包装类
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {

    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream consoleStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        testString.printSomething();

        System.setOut(consoleStream);

        String result = outputStream.toString().toUpperCase();
        System.out.println(result);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("这是用于测试的文本");
        }
    }
}
