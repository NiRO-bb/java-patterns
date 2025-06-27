/**
 * Demonstrates the Observer design pattern work.
 * <p>
 * Contains {@code main} method that creates Observer instances and then notify them with Subject instance.
 *
 * @see Observer
 * @see Subject
 */
public final class Starter {

    private Starter() {}

    /**
     * Program entry point.
     * <p>
     * Creates two observers and one subject instances.
     * Call event few times and outputs result.
     *
     * @param args command line arguments
     */
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
