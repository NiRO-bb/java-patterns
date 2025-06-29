package builder;

/**
 * Represents concrete builder of builder.Product class.
 *
 * @see Product
 */
public class ProductBuilderOne implements Builder {

    private Product product;

    /**
     * Creates new builder.ProductBuilderOne instance.
     *
     * @param product instance that should be initialized
     */
    public ProductBuilderOne(Product product) {
        this.product = product;
    }

    @Override
    public Builder setColor() {
        product.setColor("Red");
        return this;
    }

    @Override
    public Builder setShape() {
        product.setShape("Circle");
        return this;
    }

    @Override
    public Builder setSize() {
        product.setSize(5);
        return this;
    }

    @Override
    public Product build() {
        return product;
    }

}
