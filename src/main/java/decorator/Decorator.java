package decorator;

/**
 * Abstract class for all decorator.Component decorators.
 * <p>
 * Concrete decorators should extend this class to add new functionality.
 */
public abstract class Decorator implements Component {

    protected Component component;

    /**
     * Creates a new decorator.Decorator instance wrapping the specified decorator.Component.
     * <p>
     * All decorators must wrap an existing decorator.Component instance.
     *
     * @param component the decorator.Component instance to decorate
     */
    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public String getStatus() {
        return component.getStatus();
    }

    @Override
    public void printStatus() {
        component.printStatus();
    }

}
