package zh.codegym.task.task18.task1826;

/* 
加密
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        String mode = args[0];
        try (FileInputStream fileInputStream = new FileInputStream(args[1]);
             FileOutputStream fileOutputStream = new FileOutputStream(args[2])) {
            if ("-e".equals(mode)) {
                while (fileInputStream.available() > 0) {
                    fileOutputStream.write(fileInputStream.read()+1);
                }
            } else {
                while (fileInputStream.available() > 0) {
                    fileOutputStream.write(fileInputStream.read()-1);
                }
            }
        }

    }
}
