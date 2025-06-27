package observer;

import java.util.LinkedList;
import java.util.List;

/**
 * Represents observer.Subject class.
 */
public class ConcreteSubject implements Subject {

    private List<Observer> observers;

    /**
     * Creates new observer.ConcreteSubject instance.
     * <p>
     * Initializes observer list with LinkedList instance.
     */
    public ConcreteSubject() {
        observers = new LinkedList<>();
    }

    /**
     * Calls some event, then notifies all attached observers.
     */
    public void event() {
        System.out.println("Something happened!");
        notifyObservers();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }

}
