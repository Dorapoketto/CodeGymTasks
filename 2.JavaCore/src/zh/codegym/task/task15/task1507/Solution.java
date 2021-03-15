package zh.codegym.task.task15.task1507;

/* 
OOP：方法重载
*/

public class Solution {

    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("填写 String 对象");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, Integer value) {
        System.out.println("填写 Integer 对象");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, Double value) {
        System.out.println("填写 Double 对象");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, Float value) {
        System.out.println("填写 Float 对象");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, Long value) {
        System.out.println("填写 Long 对象");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, Boolean value) {
        System.out.println("填写 Boolean 对象");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, Short value) {
        System.out.println("填写 Short 对象");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, Character value) {
        System.out.println("填写 Character 对象");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, Byte value) {
        System.out.println("填写 Byte 对象");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
