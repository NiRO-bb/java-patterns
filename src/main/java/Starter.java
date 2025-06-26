public final class Starter {

    private Starter() {}

    public static void main(String[] args) {
        Adapter adapter = new ConcreteAdapter(new Adaptee());
        System.out.println(adapter.getStatus());
        adapter.printStatus();
    }

}
