/**
 * Demonstrates Decorator design pattern work.
 * <p>
 * Contains {@code main} method that creates and uses different instance of decorators.
 *
 * @see ConcreteDecoratorOne
 * @see ConcreteDecoratorTwo
 */
public final class Starter {

    private Starter() {}

    /**
     * Program entry point.
     * <p>
     * Creates and demonstrates three different component configurations:
     * 1. ConcreteComponent without decorators
     * 2. ConcreteComponent wrapped with ConcreteDecoratorOne
     * 3. ConcreteComponent wrapped with ConcreteDecoratorTwo
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Component comp1 = new ConcreteComponent("chill");
        System.out.println(comp1.getStatus());
        comp1.printStatus();
        System.out.println();

        Component comp2 = new ConcreteDecoratorOne(new ConcreteComponent("run"));
        System.out.println(comp2.getStatus());
        comp2.printStatus();
        System.out.println();

        Component comp3 = new ConcreteDecoratorTwo(new ConcreteComponent());
        System.out.println(comp3.getStatus());
        comp3.printStatus();
    }

}
