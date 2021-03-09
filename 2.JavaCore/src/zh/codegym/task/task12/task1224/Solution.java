package zh.codegym.task.task12.task1224;

/* 
未知动物
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        if (o instanceof Cat)
            return "猫";

        if (o instanceof Tiger)
            return "老虎";

        if (o instanceof Lion)
            return "狮子";

        if (o instanceof Bull)
            return "公牛";

        return "动物";
    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
