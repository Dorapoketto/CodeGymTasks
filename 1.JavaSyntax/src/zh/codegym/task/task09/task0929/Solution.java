package zh.codegym.task.task09.task0929;

import java.io.*;

/* 
让代码发挥它的用武之地！
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


            String sourceFileName = reader.readLine();
            String destinationFileName = reader.readLine();

            InputStream fileInputStream = getInputStream(sourceFileName);
            OutputStream fileOutputStream = getOutputStream(destinationFileName);

            while (fileInputStream.available() > 0) {
                int data = fileInputStream.read();
                fileOutputStream.write(data);
            }

            fileInputStream.close();
            fileOutputStream.close();
        }catch (IOException e){
            System.out.println("文件不存在");
//            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//            String sourceFileName = reader.readLine();

        }finally {

        }
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}

