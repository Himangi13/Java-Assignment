package assignments;

public class QuadrilateralDemo {
    public static void main(String[] args) {
        // Create instances of different quadrilateral shapes
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Parallelogram parallelogram = new Parallelogram(7, 8);
 
        // Calculate and print areas
        System.out.println("Area of square: " + square.area());
        System.out.println("Area of rectangle: " + rectangle.area());
        System.out.println("Area of parallelogram: " + parallelogram.area());
    }
}
 
abstract class Quadrilateral {
    protected int base;
    protected int height;
 
    public Quadrilateral() {
        this.base = 0;
        this.height = 0;
    }
 
    public Quadrilateral(int base, int height) {
        this.base = base;
        this.height = height;
    }
 
    public int getBase() {
        return base;
    }
 
    public void setBase(int base) {
        this.base = base;
    }
 
    public int getHeight() {
        return height;
    }
 
    public void setHeight(int height) {
        this.height = height;
    }
 
    public abstract int area();
}
 
class Square extends Quadrilateral {
    public Square(int side) {
        super(side, side);
    }
 
    @Override
    public int area() {
        return base * base;
    }
}
 
class Rectangle extends Quadrilateral {
    public Rectangle(int length, int width) {
        super(length, width);
    }
 
    @Override
    public int area() {
        return base * height;
    }
}
 
class Parallelogram extends Quadrilateral {
    public Parallelogram(int base, int height) {
        super(base, height);
    }
 
    @Override
    public int area() {
        return base * height;
    }
}