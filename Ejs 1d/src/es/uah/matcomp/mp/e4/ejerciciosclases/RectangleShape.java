package es.uah.matcomp.mp.e4.ejerciciosclases;

public class RectangleShape extends Shape {
    protected double width = 1.0;
    protected double length = 1.0;

    // Constructores
    public RectangleShape() {
        this.width=1.0;
        this.length=1.0;
    }
    public RectangleShape(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public RectangleShape(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }
    //Metodos
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "RectangleShape[Shape[color=" + color + ", filled=" + filled + "], width=" + width + ", length=" + length + "]";
    }
}