package es.uah.matcomp.mp.e4.ejerciciosclases;
//Igual que Circle pero cambiando el radio privado a protegido para el ejercicio de Resizable
public class CircleR implements GeometricObject{
    protected double radius;
    //Contructor
    public CircleR(double radius) {
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
        return "CircleR[radius=" + radius + "]";
    }
}
