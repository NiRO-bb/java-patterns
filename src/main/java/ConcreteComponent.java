public class ConcreteComponent implements Component {

    private String status;

    public ConcreteComponent() {
        status = "sleep";
    }

    public ConcreteComponent(String status) {
        this.status = status;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void printStatus() {
        System.out.printf("current status is %s", status);
    }

}
