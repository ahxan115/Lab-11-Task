
package calculateareas;

public class triangle implements shape{
    private final double a, b, c; 

    public triangle() {
        this(1,1,1);
    }
    public triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        // Heron's formula:

        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
