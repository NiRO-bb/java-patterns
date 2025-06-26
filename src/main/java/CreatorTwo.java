/**
 * Concrete creator for ProductTwo instances.
 * <p>
 * Implements the Creator interface to create ProductTwo objects.
 *
 * @see ProductTwo
 */
public class CreatorTwo implements Creator {

    @Override
    public Product createProduct() {
        return new ProductTwo();
    }

}
