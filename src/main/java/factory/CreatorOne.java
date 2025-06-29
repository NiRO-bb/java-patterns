package factory;

/**
 * Concrete creator for factoryMethod.ProductOne instances.
 * <p>
 * Implements the factoryMethod.Creator interface to create factoryMethod.ProductOne objects.
 *
 * @see ProductOne
 */
public class CreatorOne implements Creator {

    @Override
    public Product createProduct() {
        return new ProductOne();
    }

}
