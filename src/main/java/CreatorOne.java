public class CreatorOne implements Creator {

    @Override
    public Product createProduct() {
        return new ProductOne();
    }

}
