package zh.codegym.task.task17.task1711;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
CRUD 2
*/

public class Solution {

    public static volatile List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("唐纳德·坎普", new Date()));  // id=0
        allPeople.add(Person.createMale("拉里·盖茨", new Date()));  // id=1
    }

    public static void main(String[] args) {
        // 在这里开始
    }
}
