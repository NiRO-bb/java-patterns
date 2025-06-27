public class ProductBuilderTwo implements Builder {

    private Product product;

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
