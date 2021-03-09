package zh.codegym.task.task06.task0617;

/* 
新想法的记事本
*/

public class Solution {
    public static void main(String[] args) {
        printIdea(new Idea());
    }

    //在此编写你的代码
    public static class Idea{
        public String getDescription(){
            return "hhhh";
        }
    }

    public static void printIdea(Idea idea){
        System.out.println(idea.getDescription());
    }
}
