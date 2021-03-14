package zh.codegym.task.task14.task1414;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
电影工厂
*/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String key = null;
        while ((key = reader.readLine()) != null) {
            Movie movie = MovieFactory.getMovie(key);
            if(movie == null) {
                return;
            }
            System.out.println(movie.getClass().getSimpleName());
        }

        /*
            8.在 Movie 类中创建变量 movie，并针对每个输入的字符串（键）:
            8.1.使用 MovieFactory.getMovie 获取对象并将其赋给变量 movie。
            8.2.显示调用 movie.getClass().getSimpleName() 的结果。
        */

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            // 为键“soapOpera”创建 SoapOpera 对象
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }

            //在此编写你的代码.项目 5、6
            if ("cartoon".equals(key)){
                movie = new Cartoon();
            }

            if ("thriller".equals(key)){
                movie = new Thriller();
            }
            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    // 在此编写类。项目 3

    static class Cartoon extends Movie{

    }

    static class Thriller extends  Movie{

    }
}
