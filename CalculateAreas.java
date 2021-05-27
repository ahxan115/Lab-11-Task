package calculateareas;

public class CalculateAreas {

    public static void main(String[] args) {

        // Circle test
        double radius = 2;
        shape circle = new circle(radius);
        System.out.println("Circle radius: " + radius + "\nArea: " + circle.area() + "\n");

        // Triangle test
        double a = 3, b = 3, c = 3;
        shape triangle = new triangle(a,b,c);
        System.out.println("Triangle sides length: " + a + ", " + b + ", " + c + "\nArea: " + triangle.area() + "\n");
        
        // Rectangle test
        double width = 2, length = 4;
        shape rectangle = new rectangle(width, length);
        System.out.println("Rectangle width: " + width + " and length: " + length + "\nArea: " + rectangle.area()+ "\n");
    
    }
}
