/**
 * Concrete creator for ProductOne instances.
 * <p>
 * Implements the Creator interface to create ProductOne objects.
 *
 * @see ProductOne
 */
public class CreatorOne implements Creator {

    @Override
    public Product createProduct() {
        return new ProductOne();
    }

}
