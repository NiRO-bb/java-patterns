package decorator;

/**
 * Defines the basic interface for objects that can be decorated.
 */
public interface Component {

    /**
     * Returns the current status of the component.
     *
     * @return string representing the current component status
     */
    String getStatus();

    /**
     * Displays the component status.
     */
    void printStatus();

}
