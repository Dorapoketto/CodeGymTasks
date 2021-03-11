package zh.codegym.task.task14.task1421;

class Singleton{
    private static Singleton instance;

    public static Singleton getInstance(){

        return instance;
    }

    private Singleton(){

    }
}