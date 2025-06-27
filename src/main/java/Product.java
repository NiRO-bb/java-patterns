public class Product {

    private String color;
    private int size;
    private String shape;

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return String.format("This product has %s color, shape of %s and %d size", color, shape, size);
    }

}
