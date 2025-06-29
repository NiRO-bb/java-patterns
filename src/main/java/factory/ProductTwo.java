package factory;

/**
 * Concrete implementation of the factoryMethod.Product interface.
 * <p>
 * This class provides specific functionality for factoryMethod.Product type.
 */
public class ProductTwo implements Product {

    @Override
    public void printProductInfo() {
        System.out.println("factoryMethod.ProductTwo instance has not any info.");
    }

}
