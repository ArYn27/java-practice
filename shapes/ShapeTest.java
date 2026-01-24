package shapes;

public class ShapeTest {
    public static void main(String[] args) {
        // Create objects
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Print details
        circle.printDetails();
        System.out.println("-------------------");
        rectangle.printDetails();
    }
}
