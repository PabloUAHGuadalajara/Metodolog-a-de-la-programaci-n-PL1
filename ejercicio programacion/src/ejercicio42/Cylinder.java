package ejercicio42;

public class Cylinder {
    private Circle base;
    private double height;

    // Constructor por defecto
    public Cylinder() {
        base = new Circle();
        height = 1.0;
    }

    // Constructor con altura
    public Cylinder(double height) {
        base = new Circle();
        this.height = height;
    }

    // Constructor con radio y altura
    public Cylinder(double radius, double height) {
        base = new Circle(radius);
        this.height = height;
    }

    // Constructor con radio, altura y color
    public Cylinder(double radius, double height, String color) {
        base = new Circle(radius, color);
        this.height = height;
    }

    public Circle getBase() { return base; }
    public void setBase(Circle base) { this.base = base; }
    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    public double getArea() {
        return 2 * Math.PI * base.getRadius() * height + 2 * base.getArea();
    }

    public double getVolume() {
        return base.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder: base=" + base + " height=" + height;
    }
}