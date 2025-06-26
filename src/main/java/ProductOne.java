/**
 * Concrete implementation of the Product interface.
 * <p>
 * This class provides specific functionality for Product type.
 */
public class ProductOne implements Product {

    private String value;

    /**
     * Default constructor.
     * <p>
     * Sets the "empty" value for product info.
     *
     * @see #printProductInfo()
     */
    public ProductOne() {
        value = "empty";
    }

    @Override
    public void printProductInfo() {
        System.out.println(String.format("ProductOne instance has %s value.", value));
    }

}
