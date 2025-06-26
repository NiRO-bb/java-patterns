public abstract class Decorator implements Component {

    protected Component component;

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
