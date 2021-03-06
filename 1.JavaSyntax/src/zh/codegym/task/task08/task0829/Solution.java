package zh.codegym.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
软件更新
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 地址列表
        Map<String,String> addresses = new HashMap<>();
        while (true) {
            String city = reader.readLine();

            if (city.isEmpty()) break;
            String family = reader.readLine();
            addresses.put(city,family);
        }

        // 读取门牌号
        System.out.println("输入城市");
        String cityName = reader.readLine();

        for(String key:addresses.keySet()) {
            if(key.equals(cityName)){
                System.out.println(addresses.get(cityName));
            }

        }
    }
}
