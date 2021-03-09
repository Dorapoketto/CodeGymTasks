package zh.codegym.task.task03.task0315;

/* 
七色彩虹...
*/

public class Solution {

    public static void main(String[] args) {
        //在此编写你的代码
        Red red = new Red();
        new Orange();
        new Yellow();
        new Green();
        new Blue();
        new Indigo();
        new Violet();
    }

    public static class Red {
        public Red() {
            System.out.println("红色");
        }
    }

    public static class Orange {
        public Orange() {
            System.out.println("橙色");
        }
    }

    public static class Yellow {
        public Yellow() {
            System.out.println("黄色");
        }
    }

    public static class Green {
        public Green() {
            System.out.println("绿色");
        }
    }

    public static class Blue {
        public Blue() {
            System.out.println("蓝色");
        }
    }

    public static class Indigo {
        public Indigo() {
            System.out.println("靛色");
        }
    }

    public static class Violet {
        public Violet() {
            System.out.println("紫色");
        }
    }
}
