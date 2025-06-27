public class ObserverTwo implements Observer {

    @Override
    public void update() {
        System.out.println("ObserverTwo instance get a notification from Subject.");
    }

}
