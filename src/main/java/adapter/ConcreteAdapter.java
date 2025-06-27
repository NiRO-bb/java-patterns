package adapter;

/**
 * adapter.Adapter implementation that bridges the adapter.Adaptee interface to the target adapter.Adapter interface.
 *
 * @see Adaptee
 */
public class ConcreteAdapter implements Adapter {

    private Adaptee adaptee;

    /**
     * Creates a new adapter.ConcreteAdapter wrapping the specified adapter.Adaptee.
     *
     * @param adaptee the adapter.Adaptee instance to wrap
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
