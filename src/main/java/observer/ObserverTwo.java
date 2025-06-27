package observer;

/**
 * Represent concrete observer.
 */
public class ObserverTwo implements Observer {

    @Override
    public void update() {
        System.out.println("observer.ObserverTwo instance get a notification from observer.Subject.");
    }

}
