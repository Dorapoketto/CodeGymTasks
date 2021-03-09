package zh.codegym.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
善良的艾玛和暑假
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("史泰龙", df.parse("JUNE 1 1980"));

        //在此编写你的代码
        map.put("史", df.parse("MARCH 2 1980"));
        map.put("史泰", df.parse("JUNE 3 1980"));
        map.put("史泰龙1", df.parse("JUNE 4 1980"));
        map.put("史泰2", df.parse("JUNE 1 1980"));
        map.put("史泰3", df.parse("JUNE 10 1980"));
        map.put("史泰4", df.parse("JULY 1 1980"));
        map.put("史5", df.parse("FEBRUARY 1 1980"));
        map.put("史泰龙6", df.parse("OCTOBER 1 1980"));
        map.put("史泰5", df.parse("JUNE 1 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //在此编写你的代码
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Date date = iterator.next().getValue();
            String moon = date.toString().split(" ")[1];
            List<String> moons = new ArrayList<>();
            Collections.addAll(moons,"Jun","Jul","Aug");
            if(moons.contains(moon)){
                iterator.remove();
            }
        }


    }

    public static void main(String[] args) throws ParseException {
        HashMap<String, Date> map = createMap();
        removeAllSummerPeople(map);
    }
}
