/**
 * Represent concrete observer.
 */
public class ObserverOne implements Observer {

    private int eventCounter;

    /**
     * Default constructor.
     * <p>
     * Initializes event counter with 0 value.
     */
    public ObserverOne() {
        eventCounter = 0;
    }

    @Override
    public void update() {
        eventCounter++;
    }

    @Override
    public String toString() {
        return String.format("ObserverOne instance counts %d event(s).", eventCounter);
    }

}
