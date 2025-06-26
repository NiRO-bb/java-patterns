/**
 * Concrete decorator that adds some formatting.
 * <p>
 * Extends the base Decorator class.
 *
 * @see Component
 */
public class ConcreteDecoratorOne extends Decorator {

    private Component component;

    public ConcreteDecoratorOne(Component component) {
        super(component);
        this.component = component;
    }

    @Override
    public void printStatus() {
        System.out.print("<<<-");
        component.printStatus();
        System.out.print("->>>\n");
    }

}
