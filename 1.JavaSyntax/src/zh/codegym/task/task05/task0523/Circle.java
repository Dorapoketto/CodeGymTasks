package zh.codegym.task.task05.task0523;

/* 
构造方法
*/

public class Circle {
    public Color color;

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.color.setDescription("红色");
        System.out.println(circle.color.getDescription());
    }

    public Circle() {
        color = new Color();
    }

    public class Color {
        String description;

        public String getDescription() {
            return this.description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
