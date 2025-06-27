package builder;

/**
 * Demonstrates the builder.Builder design pattern work.
 * <p>
 * Contains {@code main} method that creates two different builder.Product instances, then output their data.
 */
public final class Starter {

    private Starter() {}

    /**
     * Program entry point.
     * <p>
     * Creates two builders for builder.Product class.
     * Assembly builder.Product instances and then output information about them.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Builder builder1 = new ProductBuilderOne(new Product());
        Builder builder2 = new ProductBuilderTwo(new Product());
        Director director = new Director();

        director.construct(builder1);
        Product product1 = builder1.build();
        System.out.println(product1);

        director.construct(builder2);
        Product product2 = builder2.build();
        System.out.println(product2);
    }

}
