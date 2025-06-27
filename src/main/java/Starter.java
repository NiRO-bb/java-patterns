public final class Starter {

    private Starter() {}

    public static void main(String[] args) {
        ConcreteSubject sub = new ConcreteSubject();
        Observer obs1 = new ObserverOne();
        Observer obs2 = new ObserverTwo();

        sub.attach(obs1);
        sub.attach(obs2);

        sub.event();
        sub.event();
        System.out.println(obs1);

        sub.detach(obs2);

        sub.event();
        System.out.println(obs1);
    }

}
