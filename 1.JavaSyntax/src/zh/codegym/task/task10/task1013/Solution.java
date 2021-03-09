package zh.codegym.task.task10.task1013;

/* 
Human 类构造函数
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // 在此写变量和构造函数
        private String name;
        private int sex;
        private int age;
        private String nation;
        private Human father;
        private Human mather;

        public Human(){

        }

        public Human(String name) {
            this.name = name;
        }

        public Human(int sex) {
            this.sex = sex;
        }

        public Human(String name, int sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(Human father) {
            this.father = father;
        }

        public Human(String name, int sex, int age, String nation) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.nation = nation;
        }

        public Human(String name, int sex, int age, String nation, Human father) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.nation = nation;
            this.father = father;
        }

        public Human(String name, int sex, int age, String nation, Human father, Human mather) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.nation = nation;
            this.father = father;
            this.mather = mather;
        }

        public Human(int sex, int age) {
            this.sex = sex;
            this.age = age;
        }

        public Human(int sex, int age, String nation, Human father) {
            this.sex = sex;
            this.age = age;
            this.nation = nation;
            this.father = father;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


    }
}
