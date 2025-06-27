public final class Starter {

    private Starter() {}

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
