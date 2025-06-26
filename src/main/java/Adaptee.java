/**
 * Represents the class that must be used by Client(Starter).
 * <p>
 * Contains few methods that can't be accessed by default.
 */
public class Adaptee {

    private String status;

    /**
     * Default constructor.
     * <p>
     * Sets the "sleep" value for class status.
     */
    public Adaptee() {
        status = "sleep";
    }

    /**
     * Creates Adaptee with specified status.
     * <p>
     * Allows initialization of the Adaptee with a custom status value.
     * The status can be any string representing the current state.
     *
     * @param status the initial status value
     */
    public Adaptee(String status) {
        this.status = status;
    }

    /**
     * Gets the current status value.
     * <p>
     * Returns the string representation of the Adaptee's current state.
     *
     * @return current status string
     */
    public String getStatusOfAdapteeClass() {
        return status;
    }

    /**
     * Prints the current status.
     */
    public void printStatusOfAdapteeClass() {
        System.out.println(String.format("Adaptee instance status is %s.", status));
    }

}
