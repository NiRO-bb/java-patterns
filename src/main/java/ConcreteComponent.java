/**
 * Concrete implementation of Component interface.
 * <p>
 * Represents the object that can be decorated with additional functionality.
 */
public class ConcreteComponent implements Component {

    private String status;

    /**
     * Default constructor.
     * <p>
     * Sets "sleep" value for class status.
     */
    public ConcreteComponent() {
        status = "sleep";
    }

    /**
     * Creates instance with custom status.
     *
     * @param status value for class status
     */
    public ConcreteComponent(String status) {
        this.status = status;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void printStatus() {
        System.out.printf("current status is %s", status);
    }

}
