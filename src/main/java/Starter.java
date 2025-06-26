public final class Starter {

    private Starter() {}

    public static void main(String[] args) {
        Creator productOneCreator = new CreatorOne();
        ProductOne productOne = (ProductOne) productOneCreator.createProduct();
        productOne.printProductInfo();

        Creator productTwoCreator = new CreatorTwo();
        ProductTwo productTwo = (ProductTwo) productTwoCreator.createProduct();
        productTwo.printProductInfo();
    }

}
