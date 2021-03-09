package zh.codegym.task.task05.task0526;

/* 
男人和女人
*/

public class Solution {
    public static void main(String[] args) {
        //在此编写你的代码
        Man man1 = new Man("man1",1,"hh");
        Man man2 = new Man("man2",1,"hh");

        Woman woman1 = new Woman("woman1",1,"hh");
        Woman woman2 = new Woman("woman2",1,"hh");

        System.out.println(man1.name+" "+man1.age+" "+man1.address);
        System.out.println(man2.name+" "+man2.age+" "+man2.address);
        System.out.println(woman1.name+" "+woman1.age+" "+woman1.address);
        System.out.println(woman2.name+" "+woman2.age+" "+woman2.address);
    }

    //在此编写你的代码
    public static class Man{
        String name;
        int age;
        String address;

        public Man(String name,int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman{
        String name;
        int age;
        String address;

        public Woman(String name,int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
