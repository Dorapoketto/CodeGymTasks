package zh.codegym.task.task08.task0820;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* 
动物集
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();

        //在此编写你的代码
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();

        Collections.addAll(result,cat1,cat2,cat3,cat4);
        return result;
    }

    public static Set<Dog> createDogs() {
        //在此编写你的代码
        HashSet<Dog> result = new HashSet<Dog>();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        Collections.addAll(result,dog1,dog2,dog3);

        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //在此编写你的代码
        Set<Object> set = new HashSet<>();
        set.addAll(cats);
        set.addAll(dogs);
        return set;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //在此编写你的代码
        //Set<Object> set = new HashSet<>(pets);
        for(Cat cat:cats){
            pets.remove(cat);
        }

    }

    public static void printPets(Set<Object> pets) {
        //在此编写你的代码
        for(Object e:pets){
            System.out.println(e);
        }
    }

    //在此编写你的代码
    public static class Cat{

    }

    public static class Dog{

    }
}
