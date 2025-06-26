public class Adaptee {

    private String status;

    public Adaptee() {
        status = "sleep";
    }

    public Adaptee(String status) {
        this.status = status;
    }

    public String getStatusOfAdapteeClass() {
        return status;
    }

    public void printStatusOfAdapteeClass() {
        System.out.println(String.format("Adaptee instance status is %s.", status));
    }

}
