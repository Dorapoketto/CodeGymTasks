package zh.codegym.task.task08.task0824;

/* 
构建家庭
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //在此编写你的代码
        Human grandpa1 = new Human();
        Human grandpa2 = new Human();
        Human grandam1 = new Human();
        Human grandma2 = new Human();

        System.out.println(grandam1.toString());

    }

    public static class Human {
        //在此编写你的代码
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public String toString() {
            String text = "";
            text += "名字：" + this.name;
            text += "，性别：" + (this.sex ? "男" : "女");
            text += "，年龄：" + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += "，孩子：" + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += "，" + child.name;
                }
            }
            return text;
        }
    }

}
