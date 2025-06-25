package singleton;

public final class SingletonClass {

    private static SingletonClass instance;

    private String status;

    private SingletonClass() {
        status = "none";
    }

    private SingletonClass(String status) {
        this.status = status;
    }

    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }

    public static SingletonClass getInstance(String status) {
        if (instance == null) {
            instance = new SingletonClass(status);
        }
        return instance;
    }

    public String getStatus() {
        return status;
    }

    public void printStatus() {
        System.out.println(status);
    }

}
