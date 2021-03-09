package zh.codegym.task.task08.task0827;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* 
处理日期
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Map<String, Integer> map = new HashMap<String, Integer>(){
            {
                put("JANUARY",1);
                put("FEBRUARY",2);
                put("MARCH",3);
                put("APRIL",4);
                put("MAY",5);
                put("JUNE",6);
                put("JULY",7);
                put("AUGUST",8);
                put("SEPTEMBER",9);
                put("OCTOBER",10);
                put("NOVEMBER",11);
                put("DECEMBER",12);
            }
        };
        int moon=0;
        String[] strs = date.split(" ");
        for(String key:map.keySet()){
            if(strs[0].equals(key)){
                moon = map.get(key);
            }
        }

        Date yearStartTime = new Date();
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);

        yearStartTime.setDate(1);      // 当月第一天
        yearStartTime.setMonth(0);     // 一月（从 0 到 11 对月份编制索引）
        yearStartTime.setYear(Integer.parseInt(strs[2]));

        Date currentTime = new Date();
        currentTime.setDate(Integer.parseInt(strs[1]));
        currentTime.setMonth(moon-1);
        currentTime.setYear(Integer.parseInt(strs[2]));
        long msTimeDifference = currentTime.getTime() - yearStartTime.getTime();
        long msDay = 24 * 60 * 60 * 1000;  // 24 小时内的毫秒数
        int dayCount = (int) (msTimeDifference/msDay+1);
        if(dayCount%2!=0) {
            return true;
        }else {
            return false;
        }
    }
}
