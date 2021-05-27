
package calculateareas;

public class rectangle implements shape{
    private final double width, length;

    public rectangle() {
        this(1,1);
    }
    public rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        // A = w * l
        return width * length;
    }
}
