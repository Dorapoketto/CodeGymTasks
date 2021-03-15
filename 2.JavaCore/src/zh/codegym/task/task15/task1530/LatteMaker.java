package zh.codegym.task.task15.task1530;

public class LatteMaker extends DrinkMaker{
    @Override
    public void getRightCup() {
        System.out.println("拿一个杯子装拿铁");
    }

    @Override
    public void addIngredients() {
        System.out.println("煮咖啡");
    }

    @Override
    public void pour() {
        System.out.println("倒入泡沫牛奶");
    }
}
