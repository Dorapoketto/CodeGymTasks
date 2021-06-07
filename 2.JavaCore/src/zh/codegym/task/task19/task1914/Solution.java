package zh.codegym.task.task19.task1914;

/* 
问题解决
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream  consoleStream = System.out;

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);
        testString.printSomething();
        System.setOut(consoleStream);

        String str = byteArrayOutputStream.toString();
        String[] strings = str.split(" ");

        int x = Integer.parseInt(strings[0]);
        int y = Integer.parseInt(strings[2]);
        int result;
        String operator = strings[1];
        if(operator.equals("+"))
            result = x + y;
        else if (operator.equals("-"))
            result = x - y;
        else
            result = x * y;

        System.out.println(x + " " + operator + " " +y + " " + "=" + " " + result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

