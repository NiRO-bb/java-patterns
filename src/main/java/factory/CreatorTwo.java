package factory;

/**
 * Concrete creator for factoryMethod.ProductTwo instances.
 * <p>
 * Implements the factoryMethod.Creator interface to create factoryMethod.ProductTwo objects.
 *
 * @see ProductTwo
 */
public class CreatorTwo implements Creator {

    @Override
    public Product createProduct() {
        return new ProductTwo();
    }

}
