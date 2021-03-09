package zh.codegym.task.task06.task0614;

import java.util.ArrayList;

/* 
static 猫
*/

public class Cat {
    //在此编写你的代码
    public static ArrayList<Cat> cats= new ArrayList<Cat>();

    public Cat() {
    }

    public static void main(String[] args) {
        //在此编写你的代码
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        Cat cat6 = new Cat();
        Cat cat7 = new Cat();
        Cat cat8 = new Cat();
        Cat cat9 = new Cat();
        Cat cat10 = new Cat();

        cats.add(cat1);
        cats.add( cat2);
        cats.add( cat3);
        cats.add(cat4);
        cats.add(cat5);
        cats.add(cat6);
        cats.add(cat7);
        cats.add(cat8);
        cats.add(cat9);
        cats.add(cat10);

        printCats();
    }

    public static void printCats() {
        //在此编写你的代码
        for(int i=0;i<cats.size();i++){
            System.out.println(cats.get(i));
        }
    }
}
