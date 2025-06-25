package singleton;

public final class Starter {

    private Starter() {}

    public static void main(String[] args) {

        SingletonClass singleton1 = SingletonClass.getInstance();
        singleton1.printStatus();

        SingletonClass singleton2 = SingletonClass.getInstance("new status");
        singleton2.printStatus();
    }

}
