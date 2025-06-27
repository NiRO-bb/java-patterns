/**
 * Assemblies the Product instance by Builder.
 *
 * @see Builder
 * @see Product
 */
public class Director {

    /**
     * Uses Builder methods for data setting.
     *
     * @param builder Builder instance that will be used for initialization
     */
    public void construct(Builder builder) {
        builder.setColor().setShape().setSize();
    }

}
