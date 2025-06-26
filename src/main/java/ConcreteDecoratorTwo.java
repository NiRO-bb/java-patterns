/**
 * Concrete decorator that adds some formatting.
 * <p>
 * Extends the base Decorator class.
 *
 * @see Component
 */
public class ConcreteDecoratorTwo extends Decorator {

    private Component component;

    public ConcreteDecoratorTwo(Component component) {
        super(component);
        this.component = component;
    }

    @Override
    public String getStatus() {
        return String.format("(%s)", component.getStatus());
    }

    @Override
    public void printStatus() {
        System.out.println("-----");
        component.printStatus();
        System.out.println("\n-----");
    }

}
