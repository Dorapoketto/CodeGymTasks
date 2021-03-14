package zh.codegym.task.task14.task1408;

/* 
鸡肉工厂
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Continent.AFRICA);
        hen.getMonthlyEggCount();
    }

    static class HenFactory {

        static Hen getHen(String continent) {
            Hen hen = null;
            //在此编写你的代码
            return hen;
        }
    }


}
