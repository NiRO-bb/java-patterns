import java.util.LinkedList;
import java.util.List;

public class ConcreteSubject implements Subject {

    private List<Observer> observers;

    public ConcreteSubject() {
        observers = new LinkedList<>();
    }

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
