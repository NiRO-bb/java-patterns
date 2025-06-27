/**
 * Represents concrete builder of Product class.
 *
 * @see Product
 */
public class ProductBuilderTwo implements Builder {

    private Product product;

    /**
     * Creates new ProductBuilderTwo instance.
     *
     * @param product instance that should be initialized
     */
    public ProductBuilderTwo(Product product) {
        this.product = product;
    }

    @Override
    public Builder setColor() {
        product.setColor("Blue");
        return this;
    }

    @Override
    public Builder setShape() {
        product.setShape("Square");
        return this;
    }

    @Override
    public Builder setSize() {
        product.setSize(7);
        return this;
    }

    @Override
    public Product build() {
        return product;
    }

}
