package zh.codegym.task.task14.task1417;

import java.util.ArrayList;
import java.util.List;

/* 
货币
*/

public class Solution {

    public static void main(String[] args) {
        Person paul = new Person("保罗");
        for (Money money : paul.getAllMoney()) {
            System.out.println(paul.name + " 储备了 " + money.getAmount() + " " + money.getCurrencyName());
        }
    }

    static class Person {

        public String name;

        Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<Money>();
            //在此编写你的代码
        }

        private List<Money> allMoney;

        public List<Money> getAllMoney() {
            return allMoney;
        }
    }
}
