/**
 * Represents interface of Subject - class that will notify observers.
 */
public interface Subject {

    /**
     * Adds Observer instance to observers list.
     *
     * @param observer Observer instance that must be added to observers list
     */
    void attach(Observer observer);

    /**
     * Removes Observer instance from observers list.
     *
     * @param observer Observer instance that must be removes from observers list
     */
    void detach(Observer observer);

    /**
     * Notifies all observer from observers list about happened event.
     */
    void notifyObservers();

}
