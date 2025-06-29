package builder;

/**
 * Assemblies the builder.Product instance by builder.Builder.
 *
 * @see Builder
 * @see Product
 */
public class Director {

    /**
     * Uses builder.Builder methods for data setting.
     *
     * @param builder builder.Builder instance that will be used for initialization
     */
    public void construct(Builder builder) {
        builder.setColor().setShape().setSize();
    }

}
