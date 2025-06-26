/**
 * Abstract class for all Component decorators.
 * <p>
 * Concrete decorators should extend this class to add new functionality.
 */
public abstract class Decorator implements Component {

    protected Component component;

    /**
     * Creates a new Decorator instance wrapping the specified Component.
     * <p>
     * All decorators must wrap an existing Component instance.
     *
     * @param component the Component instance to decorate
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
