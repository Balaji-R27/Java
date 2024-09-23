public class ShapeArea {
    private double length;
    private double width;
    private double side;
    private double radius;
    private double base;
    private double height;

    // Constructor for Rectangle
    public ShapeArea(double length, double width, boolean isRectangle) {
        if (isRectangle) {
            this.length = length;
            this.width = width;
            System.out.println();
            System.out.println("Area of Rectangle: " + calculateRectangleArea());
        }
    }

    // Constructor for Square (added an additional parameter to differentiate)
    public ShapeArea(double side, boolean isSquare) {
        if (isSquare) {
            this.side = side;
            System.out.println("Area of Square: " + calculateSquareArea());
        }
    }

    // Constructor for Circle (kept as is)
    public ShapeArea(double radius) {
        this.radius = radius;
        System.out.println("Area of Circle: " + calculateCircleArea());
    }

    // Constructor for Triangle
    public ShapeArea(double base, double height) {
        this.base = base;
        this.height = height;
        System.out.println("Area of Triangle: " + calculateTriangleArea());
    }

    // Method to calculate Rectangle Area
    private double calculateRectangleArea() {
        return length * width;
    }

    // Method to calculate Square Area
    private double calculateSquareArea() {
        return side * side;
    }

    // Method to calculate Circle Area
    private double calculateCircleArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate Triangle Area
    private double calculateTriangleArea() {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        // Example usage:
        new ShapeArea(10, 5, true);         // Rectangle
        new ShapeArea(4, true);             // Square
        new ShapeArea(7);                   // Circle
        new ShapeArea(8, 6);
        System.out.println();       // Triangle
    }
}
