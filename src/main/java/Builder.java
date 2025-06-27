/**
 * Represents interface of Builder - class that initializes Product object with specific values.
 */
public interface Builder {

    /**
     * Sets the color info.
     *
     * @return Builder instance for method chaining
     */
    Builder setColor();

    /**
     * Sets the shape info.
     *
     * @return Builder instance for method chaining
     */
    Builder setShape();

    /**
     * Sets the size info.
     *
     * @return Builder instance for method chaining
     */
    Builder setSize();

    /**
     * Ends an assembly of Product instance.
     *
     * @return ready for use Product instance
     */
    Product build();

}
