package observer;

/**
 * Represents interface of observer.Subject - class that will notify observers.
 */
public interface Subject {

    /**
     * Adds observer.Observer instance to observers list.
     *
     * @param observer observer.Observer instance that must be added to observers list
     */
    void attach(Observer observer);

    /**
     * Removes observer.Observer instance from observers list.
     *
     * @param observer observer.Observer instance that must be removes from observers list
     */
    void detach(Observer observer);

    /**
     * Notifies all observer from observers list about happened event.
     */
    void notifyObservers();

}
