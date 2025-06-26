/**
 * Factory interface that describe basic behaviour of factory classes.
 * <p>
 * Interface declares the method for instantiating product.
 */
public interface Creator {

    /**
     * Creates and returns a Product instance.
     * <p>
     * Concrete implementations of this method must return a specific Product type.
     *
     * @return a new Product instance
     * @see Product
     */
    Product createProduct();

}
