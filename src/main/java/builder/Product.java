package builder;

/**
 * Represents a class that should be initialized by different ways.
 * <p>
 * Contains few fields and overrided {@code toString()} method.
 */
public class Product {

    private String color;
    private int size;
    private String shape;

    /**
     * Sets the color info.
     *
     * @param color some info about color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Sets the size info.
     *
     * @param size some info about size
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Sets the shape info.
     *
     * @param shape some info about shape
     */
    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return String.format("This product has %s color, shape of %s and %d size", color, shape, size);
    }

}
