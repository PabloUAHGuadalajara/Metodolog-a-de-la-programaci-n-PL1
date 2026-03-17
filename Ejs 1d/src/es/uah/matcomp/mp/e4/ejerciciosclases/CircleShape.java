package es.uah.matcomp.mp.e4.ejerciciosclases;

public class CircleShape extends Shape {
    protected double radius = 1.0;
    //Constructores
    public CircleShape() {}
    public CircleShape(double radius) {
        this.radius = radius;
    }
    public CircleShape(double radius, String color, boolean filled) {
        this.color=color;
        this.filled=filled;
        this.radius = radius;
    }
    //Metodos
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() { return Math.PI * radius * radius; }

    @Override
    public double getPerimeter() { return 2 * Math.PI * radius; }

    @Override
    public String toString() {
        return "CircleShape[" + super.toString() + ", radius=" + radius + "]";
    }
}
