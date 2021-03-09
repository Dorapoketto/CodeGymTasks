package zh.codegym.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;

/* 
包含猫的集
*/

public class Solution{
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //在此编写你的代码. 第 3 步
        for(Cat cat:cats){
            cats.remove(cat);
            break;
        }

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //在此编写你的代码. 第 2 步
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

        Set<Cat> set = new HashSet<Cat>(){
            {
                add(cat1);
                add(cat2);
                add(cat3);
            }
        };

        return set;
    }

    public static void printCats(Set<Cat> cats) {
        // 第 4 步
        for(Cat cat:cats){
            System.out.println(cat);
        }
    }

    // 第 1 步
    public static class Cat{

        Cat(){

        }
    }
}
