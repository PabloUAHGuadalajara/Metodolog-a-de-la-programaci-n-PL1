package es.uah.matcomp.mp.e4.ejerciciosclases;

public class Circle implements GeometricObject{
    private double radius;
    //Contructor
    public Circle(double radius) {
        this.radius = radius;
    }
    //Metodos
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}

