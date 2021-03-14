package zh.codegym.task.task14.task1408;

public class AfricanHen extends Hen {

    @Override
    String getDescription() {
        return super.getDescription() + String.format("我来自%s。我每个月下 %d 个蛋。", Continent.AFRICA, getMonthlyEggCount());
    }

    @Override
    int getMonthlyEggCount() {
        return 11;
    }
}
