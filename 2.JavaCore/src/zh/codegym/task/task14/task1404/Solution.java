package zh.codegym.task.task14.task1404;

/* 
猫
*/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        while (!"".equals(s)){
            Cat cat = CatFactory.getCatByKey(s);
            System.out.println(cat.toString());
            s = scanner.nextLine();
        }
    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat;
            if ("凶爪".equals(key)) {
                cat = new MeanCat("利爪");
            } else if ("米斯".equals(key)) {
                cat = new NiceCat("米西");
            } else if ("斯马奇".equals(key)) {
                cat = new NiceCat("斯马戈");
            } else {
                cat = new Cat(key);
            }
            return cat;
        }
    }

    static class Cat {

        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "我是" + getName() + "，一只小巷猫";
        }
    }

    static class MeanCat extends Cat {
        MeanCat(String name) {
            super(name);
        }

        public String toString() {
            return "我是" + getName() + "，我要挖掉你的眼睛";
        }
    }

    static class NiceCat extends Cat {
        NiceCat(String name) {
            super(name);
        }

        public String toString() {
            return "我是一只可爱的小猫，我叫" + getName();
        }
    }
}
