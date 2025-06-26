public class CreatorTwo implements Creator {

    @Override
    public Product createProduct() {
        return new ProductTwo();
    }

}
