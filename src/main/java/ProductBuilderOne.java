public class ProductBuilderOne implements Builder {

    private Product product;

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
