package zh.codegym.task.task09.task0919;

/* 
除零
*/

public class Solution {

    public static void main(String[] args) {
        try {
            divideByZero();
        }catch (ArithmeticException e){
            e.printStackTrace();
        }

    }

    public static void divideByZero(){
        int n = 3/0;
        System.out.println(n);
    }
}
