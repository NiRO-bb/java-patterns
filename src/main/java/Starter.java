/**
 * Demonstrates Adapter design pattern work.
 * <p>
 * Contains {@code main} method that creates and uses Adapter instance.
 *
 * @see Adapter
 */
public final class Starter {

    private Starter() {}

    /**
     * Program entry point.
     * <p>
     * Creates an Adaptee instance, wraps it with a ConcreteAdapter, and demonstrates
     * the adapted functionality by using Adaptee methods using the Adapter instance.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Adapter adapter = new ConcreteAdapter(new Adaptee());
        System.out.println(adapter.getStatus());
        adapter.printStatus();
    }

}
