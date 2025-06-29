package factory;

/**
 * Demonstrates FabricMethod design pattern work.
 * <p>
 * Contains {@code main} method that creates and uses different types of creators and products.
 */
public final class Starter {

    private Starter() {}

    /**
     * Program entry point.
     * <p>
     * Creates two different products by their creators
     * and demonstrates their functionality.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Creator productOneCreator = new CreatorOne();
        ProductOne productOne = (ProductOne) productOneCreator.createProduct();
        productOne.printProductInfo();

        Creator productTwoCreator = new CreatorTwo();
        ProductTwo productTwo = (ProductTwo) productTwoCreator.createProduct();
        productTwo.printProductInfo();
    }

}
