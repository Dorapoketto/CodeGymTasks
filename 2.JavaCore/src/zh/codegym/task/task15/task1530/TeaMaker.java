package zh.codegym.task.task15.task1530;

public class TeaMaker extends DrinkMaker{
    @Override
    public void getRightCup() {
        System.out.println("拿一个杯子装茶");
    }

    @Override
    public void addIngredients() {
        System.out.println("添加茶叶");
    }

    @Override
    public void pour() {
        System.out.println("注入沸水");
    }
}
