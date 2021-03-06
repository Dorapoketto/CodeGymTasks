package zh.codegym.task.task13.task1315;

/* 
汤姆、杰瑞和斯派克
*/

public class Solution {
    public static void main(String[] args) {

    }

    // 可以移动
    public interface CanMove {
        void move();
    }

    // 可以被吃
    public interface Edible {
        void beEaten();
    }

    // 可以吃别人
    public interface CanEat {
        void eat();
    }

    public class Cat implements CanMove, Edible, CanEat{

        @Override
        public void move() {

        }

        @Override
        public void beEaten() {

        }

        @Override
        public void eat() {

        }
    }

    public class Mouse implements CanMove, Edible{

        @Override
        public void move() {

        }


        @Override
        public void beEaten() {

        }
    }

    class Dog implements CanEat, CanMove{
        @Override
        public void move() {

        }

        @Override
        public void eat() {

        }
    }
}