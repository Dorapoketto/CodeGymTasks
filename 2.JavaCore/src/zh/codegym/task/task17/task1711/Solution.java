package zh.codegym.task.task17.task1711;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {

    public static volatile List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("唐纳德·坎普", new Date()));  // id=0
        allPeople.add(Person.createMale("拉里·盖茨", new Date()));  // id=1
    }

    private static SimpleDateFormat inputFormat = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH);
    private static SimpleDateFormat outputFormat = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);

    public static void main(String[] args) {
        // 在这里开始
        try {
            switch (args[0]){
                case "-c":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i = i + 3) {
                            String name = args[i];
                            String sex = args[i+1];
                            Date birthDay = inputFormat.parse(args[i+2]);
                            Person person = sex.equals("m")?Person.createMale(name,  birthDay):Person.createFemale(name, birthDay);
                            allPeople.add(person);
                            System.out.println(allPeople.indexOf(person));
                        }
                    }
                    break;
                case "-u":
                    synchronized (allPeople) {
                        for (int i=1; i<args.length; i = i + 4){

                            int id = Integer.parseInt(args[i]);
                            String name = args[i+1];
                            String sex = args[i+2];
                            Date birthDay = inputFormat.parse(args[i+3]);

                            allPeople.get(id).setName(name);
                            allPeople.get(id).setSex("m".equals(sex) ? Sex.MALE : Sex.FEMALE);
                            allPeople.get(id).setBirthDate(birthDay);
                        }
                    }
                    break;
                case "-d":
                    synchronized (allPeople){
                        for (int i=1; i<args.length; i++){
                            int id = Integer.parseInt(args[i]);

                            allPeople.get(id).setName(null);
                            allPeople.get(id).setSex(null);
                            allPeople.get(id).setBirthDate(null);
                        }
                    }
                    break;
                case "-i":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i++) {
                            int id = Integer.parseInt(args[i]);
                            Person person = allPeople.get(id);
                            System.out.print(person.getName() + " ");
                            System.out.print(person.getSex().equals(Sex.MALE) ? "m " : "f ");
                            System.out.println(outputFormat.format(person.getBirthDate()));
                        }
                    }
                    break;
            }
        }catch (Exception e){

        }

    }
}
