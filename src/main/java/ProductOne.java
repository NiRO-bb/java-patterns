public class ProductOne implements Product {

    private String value;

    public ProductOne() {
        value = "empty";
    }

    @Override
    public void printProductInfo() {
        System.out.println(String.format("ProductOne instance has %s value.", value));
    }

}
