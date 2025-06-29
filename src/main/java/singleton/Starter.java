package singleton;

/**
 * Demonstrates SingletonClass class work.
 * <p>
 * Contains {@code main} method that creates and uses insatnces of SingletonClass.
 *
 * @see SingletonClass
 */
public final class Starter {

    private Starter() {}

    /**
     * Program entry point.
     * <p>
     * Creates {@code singleton1} instance of SingletonClass, then tries to create new instance.
     * Outputs the results.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        SingletonClass singleton1 = SingletonClass.getInstance();
        singleton1.printStatus();

        SingletonClass singleton2 = SingletonClass.getInstance("new status");
        singleton2.printStatus();
    }

}
