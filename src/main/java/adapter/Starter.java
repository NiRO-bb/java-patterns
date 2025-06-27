package adapter;

/**
 * Demonstrates adapter.Adapter design pattern work.
 * <p>
 * Contains {@code main} method that creates and uses adapter.Adapter instance.
 *
 * @see Adapter
 */
public final class Starter {

    private Starter() {}

    /**
     * Program entry point.
     * <p>
     * Creates an adapter.Adaptee instance, wraps it with a adapter.ConcreteAdapter, and demonstrates
     * the adapted functionality by using adapter.Adaptee methods using the adapter.Adapter instance.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Adapter adapter = new ConcreteAdapter(new Adaptee());
        System.out.println(adapter.getStatus());
        adapter.printStatus();
    }

}
