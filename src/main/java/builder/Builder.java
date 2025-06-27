package builder;

/**
 * Represents interface of builder.Builder - class that initializes builder.Product object with specific values.
 */
public interface Builder {

    /**
     * Sets the color info.
     *
     * @return builder.Builder instance for method chaining
     */
    Builder setColor();

    /**
     * Sets the shape info.
     *
     * @return builder.Builder instance for method chaining
     */
    Builder setShape();

    /**
     * Sets the size info.
     *
     * @return builder.Builder instance for method chaining
     */
    Builder setSize();

    /**
     * Ends an assembly of builder.Product instance.
     *
     * @return ready for use builder.Product instance
     */
    Product build();

}
