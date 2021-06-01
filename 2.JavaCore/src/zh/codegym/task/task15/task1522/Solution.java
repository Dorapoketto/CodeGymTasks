package zh.codegym.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
巩固单例模式
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    // 在此添加 static 块
    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        // 在此实现步骤 5
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        switch (name){
            case Planet.EARTH:
                thePlanet = Earth.getInstance();
                break;
            case Planet.MOON:
                thePlanet = Moon.getInstance();
                break;
            case Planet.SUN:
                thePlanet = Sun.getInstance();
                break;
            default:
                thePlanet = null;
                break;
        }
    }
}
