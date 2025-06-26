/**
 * Target interface defining the expected client operations.
 * <p>
 * Represents the interface that clients expect to work with.
 */
public interface Adapter {

    /**
     * Get the current status information.
     * <p>
     * This method should return a string representation of the current status.
     *
     * @return string containing status info
     */
    String getStatus();

    /**
     * Displays the status info.
     */
    void printStatus();

}
