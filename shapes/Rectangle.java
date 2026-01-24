package shapes;

public class Rectangle extends Shape implements Printable {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public void printDetails() {
        System.out.println("Rectangle:");
        System.out.println("Length = " + length + ", Width = " + width);
        System.out.println("Area = " + calculateArea());
    }
}
