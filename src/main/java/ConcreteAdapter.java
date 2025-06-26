/**
 * Adapter implementation that bridges the Adaptee interface to the target Adapter interface.
 *
 * @see Adaptee
 */
public class ConcreteAdapter implements Adapter {

    private Adaptee adaptee;

    /**
     * Creates a new ConcreteAdapter wrapping the specified Adaptee.
     *
     * @param adaptee the Adaptee instance to wrap
     */
    public ConcreteAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String getStatus() {
        return adaptee.getStatusOfAdapteeClass();
    }

    @Override
    public void printStatus() {
        adaptee.printStatusOfAdapteeClass();
    }

}
