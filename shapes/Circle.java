package shapes;

public class Circle extends Shape implements Printable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void printDetails() {
        System.out.println("Circle:");
        System.out.println("Radius = " + radius);
        System.out.println("Area = " + calculateArea());
    }
}
