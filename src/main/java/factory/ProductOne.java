package factory;

/**
 * Concrete implementation of the factoryMethod.Product interface.
 * <p>
 * This class provides specific functionality for factoryMethod.Product type.
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
        System.out.println(String.format("factoryMethod.ProductOne instance has %s value.", value));
    }

}
