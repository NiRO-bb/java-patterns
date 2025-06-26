public class ConcreteAdapter implements Adapter {

    private Adaptee adaptee;

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
