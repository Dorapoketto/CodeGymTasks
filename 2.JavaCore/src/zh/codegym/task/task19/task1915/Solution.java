package zh.codegym.task.task19.task1915;

/* 
重复文本
*/

import java.io.*;

public class Solution {

    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream originStream = System.out;

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            ){

            String fileName = bufferedReader.readLine();

            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            System.setOut(new PrintStream(byteArrayOutputStream));

            testString.printSomething();

            System.setOut(originStream);

            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            fileOutputStream.write(byteArrayOutputStream.toByteArray());

            System.out.println(byteArrayOutputStream.toString());

            fileOutputStream.close();
        }catch (IOException e){

        }


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("这是用于测试的文本");
        }
    }
}

