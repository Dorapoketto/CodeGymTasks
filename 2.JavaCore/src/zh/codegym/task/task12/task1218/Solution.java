package zh.codegym.task.task12.task1218;

/* 
进食、飞行和移动
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanEat,CanMove{

        @Override
        public void move() {

        }

        @Override
        public void eat() {

        }
    }

    public class Duck implements CanMove,CanEat,CanFly{
        @Override
        public void fly() {

        }

        @Override
        public void move() {

        }

        @Override
        public void eat() {

        }
    }

    public class Car implements CanMove{
        @Override
        public void move() {

        }
    }

    public class Airplane implements CanMove, CanFly{
        @Override
        public void fly() {

        }

        @Override
        public void move() {

        }
    }
}
