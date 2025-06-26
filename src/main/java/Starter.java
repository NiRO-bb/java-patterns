public final class Starter {

    private Starter() {}

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
