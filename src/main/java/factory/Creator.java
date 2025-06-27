package factory;

/**
 * Factory interface that describe basic behaviour of factory classes.
 * <p>
 * Interface declares the method for instantiating product.
 */
public interface Creator {

    /**
     * Creates and returns a factoryMethod.Product instance.
     * <p>
     * Concrete implementations of this method must return a specific factoryMethod.Product type.
     *
     * @return a new factoryMethod.Product instance
     * @see Product
     */
    Product createProduct();

}
