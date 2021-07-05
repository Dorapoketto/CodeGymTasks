package zh.codegym.task.task20.task2002;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/* 
读取并写入文件CodeGym
*/

public class Solution {

    public static void main(String[] args) {
        // 你可以在 TMP 目录中找到 your_file_name.tmp，或者按照文件的实际位置调整 outputStream/inputStream
        try {
            File yourFile = File.createTempFile("你的文件名", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            CodeGym codeGym = new CodeGym();
            // 在此初始化 codeGym 对象的 users 字段
            codeGym.users = null;
            codeGym.save(outputStream);
            outputStream.flush();

            CodeGym loadedObject = new CodeGym();
            loadedObject.load(inputStream);
            // 在此检查 codeGym 对象是否等于 loadedObject 对象
            System.out.println(codeGym.equals(loadedObject));
            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("糟糕，我的生活出现问题了");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("糟糕，save/load 方法出现问题");
        }
    }

    public static class CodeGym {

        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            // 实现此方法
            PrintWriter printWriter = new PrintWriter(outputStream);
            if (this.users.size() > 0) {
                for (User current : this.users) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(current.getFirstName());
                    sb.append("/");
                    sb.append(current.getLastName());
                    sb.append("/");
                    sb.append(current.getBirthDate().getTime());
                    sb.append("/");
                    sb.append(current.isMale());
                    sb.append("/");
                    sb.append(current.getCountry());

                    printWriter.println(sb.toString());
                }
            }
            printWriter.close();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                User user = new User();
                String[] lineArray = line.split("/");
                if (lineArray.length < 5) {
                    break;
                }
                user.setFirstName(lineArray[0]);
                user.setLastName(lineArray[1]);
                user.setBirthDate(new Date(Long.parseLong(lineArray[2])));
                user.setMale(Boolean.parseBoolean(lineArray[3]));
                switch (lineArray[4]) {
                    case "UNITED_STATES":
                        user.setCountry(User.Country.UNITED_STATES);
                        break;
                    case "UNITED_KINGDOM":
                        user.setCountry(User.Country.UNITED_KINGDOM);
                        break;
                    default:
                        user.setCountry(User.Country.OTHER);
                        break;
                }
                this.users.add(user);
            }

            reader.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodeGym codeGym = (CodeGym) o;

            return Objects.equals(users, codeGym.users);
        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() :0;
        }
    }
}
