package singleton;

/**
 * Realization of the Singleton design pattern.
 * <p>
 * Ensures that class has only one instance.
 * That instance can be accessed by {@code getInstance()} method.
 */
public final class SingletonClass {

    private static SingletonClass instance;

    private String status;

    /**
     * Default constructor.
     * <p>
     * Initializes {@code status} field with "none" value.
     * Prevents creation of class instance.
     */
    private SingletonClass() {
        status = "none";
    }

    /**
     * Constructor.
     * <p>
     * Initialize {@code status} field with passed value.
     * Prevents creation of class instance.
     *
     * @param status description of class status
     */
    private SingletonClass(String status) {
        this.status = status;
    }

    /**
     * Returns the class instance.
     * <p>
     * Checks if instance exist. Create new instance if that one not exist.
     * Returns existing instance otherwise.
     *
     * @return new or existing class instance
     */
    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }

    /**
     * Returns the class instance.
     * <p>
     * Checks if instance exist. Create new instance if that one not exist.
     * Returns existing instance otherwise.
     *
     * @param status description of class status
     * @return new or existing class instance
     */
    public static SingletonClass getInstance(String status) {
        if (instance == null) {
            instance = new SingletonClass(status);
        }
        return instance;
    }

    /**
     * Returns info about current class status.
     *
     * @return current class status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Output current status.
     * <p>
     * Uses {@code System.out.println()} method for output.
     */
    public void printStatus() {
        System.out.println(status);
    }

}
