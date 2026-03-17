package es.uah.matcomp.mp.e4.ejerciciosclases;

public class Rectangle implements GeometricObject {
    private double width;
    private double length;
    //Contructor
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    //Metodos
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
        return "Rectangle[width=" + width + ",length=" + length + "]";
    }
}